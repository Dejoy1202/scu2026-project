package com.scu.scu2026project.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration //SpringBoot注解类注解
@MapperScan("com.scu.scu2026project.mapper")
public class MyBatisPlusConfig {
}
