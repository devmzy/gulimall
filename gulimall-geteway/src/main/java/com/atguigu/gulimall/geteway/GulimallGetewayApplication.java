package com.atguigu.gulimall.geteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GulimallGetewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallGetewayApplication.class, args);
	}

}
