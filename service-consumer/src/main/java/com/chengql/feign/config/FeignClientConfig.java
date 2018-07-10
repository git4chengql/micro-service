package com.chengql.feign.config;

import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chengql
 * @create 2018-03-28 下午5:24
 **/
@Configuration
public class FeignClientConfig {

    /**
     * 开启Feign调用过程日志
     * 1.第一步在yml中增加logging配置
     * 2.第二步增加Bean
     * @return
     */
    @Bean
    public Logger.Level getFeignLoggerLevel(){
        return Logger.Level.FULL;
    }

    @Bean
    public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor(){
        return new BasicAuthRequestInterceptor("mldn","hello");
    }
}
