package com.example.payments.exapmple1_cloud.config;


import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.example.payments.exapmple1_cloud.proxy")
public class ProjectConfig {
}
