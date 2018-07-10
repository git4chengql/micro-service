package com.chengql.consumer.hystrix;

import com.chengql.consumer.web.vo.Dept;
import feign.hystrix.FallbackFactory;
import feign.service.IDept;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qlcheng on 2018/3/30.
 */
@Component
public class HystrixFallBackService implements FallbackFactory<IDept> {


    public IDept create(Throwable throwable) {
        return new IDept() {
            public List<Object> getAllDept() {
                Dept dept = new Dept();
                dept.setDeptno(0L);
                dept.setDname("DEPT微服务器错误");
                dept.setLoc("ERROR");
                List<Object> depts = new ArrayList<Object>();
                depts.add(dept);
                return depts;
            }
        };
    }
}
