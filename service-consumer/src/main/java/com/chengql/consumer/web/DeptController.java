package com.chengql.consumer.web;

import com.chengql.consumer.web.vo.Dept;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import feign.service.IDept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chengql
 * @create 2018-03-22 下午3:52
 **/
@RestController
public class DeptController {
    //@Autowired
    //private RestTemplate restTemplate;
    //public static final String url = "http://service-provider/dept/";
    //不采用Feign时的处理方式

    @Autowired
    private IDept iDept;


    /**
     * 如果当前调用的get方法出现了错误，则执行fallback
     * @return
     */
    @GetMapping("/")
    @HystrixCommand(fallbackMethod = "getFallBack")
    //针对特定方法时的处理，此种处理方式的缺点时，当方法过多时教繁琐
    //顾采用Feign服务上处理，方法为:
    //1.创建方法A extends FallbackFactory
    //2.在Feign服务上指定fallbackFactory
    public List<Object> getAllDepts(){
        //restTemplate.exchange(url, HttpMethod.GET,new HttpEntity<Object>(new HttpHeaders()), List.class).getBody();
        //采用以上方式比较繁琐，在生产环境中几乎不采用，由此引入Feign的使用
         return iDept.getAllDept();
    }

    public List<Object> getFallBack(){
        Dept dept = new Dept();
        dept.setDeptno(4L);
        dept.setDname("客户端错误");
        dept.setLoc("ERROR");
        List<Object> depts = new ArrayList<Object>();
        depts.add(dept);
        return depts;
    }
}
