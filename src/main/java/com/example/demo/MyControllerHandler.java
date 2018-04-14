package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class MyControllerHandler {
	@ResponseBody
	@ExceptionHandler(Exception.class)
	public Map<String, Object> errorHandler(Exception e ) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", -1);
		map.put("msg", e.getMessage());
		return map;
	}
	@ResponseBody
	@ExceptionHandler(PassException.class)
	public Map<String, Object> errorHandler(PassException e ) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code2",e.getMessage());
		map.put("msg2", e.getStatus());
		return map;
	}
}
