package com.example.granary;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.granary.mapper")
public class GranaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GranaryApplication.class, args);
		System.out.println("----------------------豪哥-粮仓管理系统----------------------");
	}

}
