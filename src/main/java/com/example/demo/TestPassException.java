package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestPassException {
	@RequestMapping("testexception")
	public String passexception() {
		throw new PassException("password is incorrect","-1");
	}
}
