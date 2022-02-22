package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // view를 내릴 때는 @ResponseBody 어노테이션이 없다. 
public class Lesson01Ex02Controller {

	// 요청 URL: http://localhost/lesson01/ex02/1
	@RequestMapping("/lesson01/ex02/1")
	public String ex02_1() {
		// ResponseBody가 아닌 상태로 String을 리턴하면 
		// ViewResolver에 의해서 리턴된 String 이름의 view를 찾고 view 화면이 구성된다. 
		
		// /WEB-INF/jsp/lesson01/ex02.jsp   -> 원래 이렇게 써야하는데 application.properties에 적용해놨기 때문에 요약가능 
		return "lesson01/ex02"; // jsp view 경로와 이름
	}
}
