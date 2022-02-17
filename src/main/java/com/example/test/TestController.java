package com.example.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 어노테이션
public class TestController {

	@ResponseBody
	@RequestMapping("/test1")
	public String test1() {
		return "Hello World!!!";
	}
}

// Boot Dashboard : server / was로 동작할 수 있는 프로젝트가 있다. 