package com.deepexi.user.service.user.consumer;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrix
@EnableHystrixDashboard
@SpringBootApplication(scanBasePackages = "com.deepexi", exclude = DataSourceAutoConfiguration.class)
public class DeepexiServiceUserConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeepexiServiceUserConsumerApplication.class, args);
        Main.main(args);
    }
}
