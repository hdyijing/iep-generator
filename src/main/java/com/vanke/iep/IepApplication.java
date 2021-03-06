package com.vanke.iep;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.renren.dao")
public class IepApplication {

	public static void main(String[] args) {
		SpringApplication.run(IepApplication.class, args);
	}
}
