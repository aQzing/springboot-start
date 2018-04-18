package com.example.demo;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BeanHandler {
	@RequestMapping("aStudent")
	public Student aStudent() {
		Student stu = new Student();
		stu.setAge(17);
		stu.setName("张三");
		stu.setSex("男");
		return stu;
	}
	@RequestMapping("mapStudent")
	public Map<String,Object> mapStudent() {
		Student stu1 = new Student();
		stu1.setAge(16);
		stu1.setName("张三");
		stu1.setSex("男");
		
		Student stu2 = new Student();
		stu2.setAge(18);
		stu2.setName("李四");
		stu2.setSex("男");
		
		Student stu3 = new Student();
		stu3.setAge(18);
		stu3.setName("王五");
		stu3.setSex("男");
		Map<String,Object>stuMap = new LinkedHashMap<String, Object>();
		stuMap.put("1号嘉宾", stu1);
		stuMap.put("2号嘉宾", stu2);
		stuMap.put("3号嘉宾", stu3);
		return stuMap;
	}
}
