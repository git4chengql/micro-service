package com.chengql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author chengql
 * @create 2018-04-04 下午4:59
 **/
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulServer {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServer.class,args);
    }
}
