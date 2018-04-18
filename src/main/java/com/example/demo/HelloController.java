package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${qzing.msg}")
	private String msg;
	@RequestMapping("/hello")
	public String sayHello() {
		int a = 1/0;//触发全局捕捉异常 
		return msg; 
	}
}
