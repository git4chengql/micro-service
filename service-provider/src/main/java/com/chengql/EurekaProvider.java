package com.chengql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chengql
 * @create 2018-03-19 下午5:16
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class EurekaProvider {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProvider.class,args);
    }
}
