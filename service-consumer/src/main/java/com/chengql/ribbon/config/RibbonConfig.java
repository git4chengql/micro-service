package com.chengql.ribbon.config;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;

/**
 * @author chengql
 * @create 2018-03-22 下午4:26
 **/
public class RibbonConfig {
    @Bean
    public IRule ribbonRule() { // 其中IRule就是所有规则的标准
        return new com.netflix.loadbalancer.RandomRule() ;
    }
}
