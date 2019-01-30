package com.schoolForum;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.schoolForum.schoolForum.*.dao") //指向dao层的包路径
public class SchoolForumApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolForumApplication.class, args);
	}

}

