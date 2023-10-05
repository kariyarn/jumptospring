package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.Getter;
import lombok.Setter;

@Controller
public class MainController {
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {		
		return "Hello Spring Boots";
	}
	
	@GetMapping("/sbb")
	@ResponseBody
	public String index() {
		System.out.println("index");
		return "안녕하세요 sbb에 오신 것을 환영합니다.";
	}
	
	@GetMapping("/")
	public String root() {
		return "redirect:/question/list";
	}

}
