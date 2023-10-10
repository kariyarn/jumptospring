package com.mysite.sbb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mysite.sbb.question.QuestionService;

@SpringBootApplication
public class SbbApplication {
	
	@Autowired
	private QuestionService questionService;

	public static void main(String[] args) {
		SpringApplication.run(SbbApplication.class, args);
	}

}
