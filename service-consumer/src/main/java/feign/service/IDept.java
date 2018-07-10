package feign.service;

import com.chengql.consumer.hystrix.HystrixFallBackService;
import com.chengql.consumer.web.vo.Dept;
import com.chengql.feign.config.FeignClientConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author chengql
 * @create 2018-03-28 下午3:59
 **/
@FeignClient(value="service-provider",configuration = FeignClientConfig.class,fallbackFactory = HystrixFallBackService.class)
public interface IDept {

    @RequestMapping(value="/dept/",method= RequestMethod.GET)
    public List<Object> getAllDept();

   // public boolean add(Dept dept);
}
