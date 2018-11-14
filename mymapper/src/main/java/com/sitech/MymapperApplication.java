package com.sitech;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.sitech.mapper")
public class MymapperApplication {

	public static void main(String[] args) {
		SpringApplication.run(MymapperApplication.class, args);
	}
}
