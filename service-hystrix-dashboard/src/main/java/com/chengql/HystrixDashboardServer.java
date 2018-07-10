package com.chengql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chengql
 * @create 2018-03-30 下午5:59
 **/
@SpringBootApplication
//@EnableHystrixDashboard
public class HystrixDashboardServer {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardServer.class,args);
    }
}
