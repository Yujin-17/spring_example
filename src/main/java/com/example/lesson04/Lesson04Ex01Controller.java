package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.UserBO;
import com.example.lesson04.model.User;

@Controller
public class Lesson04Ex01Controller {
	
	@Autowired
	private UserBO userBO;
	
	// 회원가입 화면 
	// 요청 URL : http://localhost/lesson04/ex01/1
	@RequestMapping(path="/lesson04/ex01/1", method=RequestMethod.GET)		// path라는 이름을 가짐 path를 붙여도 되고 안붙여도 됨. 
	public String ex01() {								// 메소드가 하나일때는 없이 써도 되지만, 메소드가 두개 이상일때는 이름 명칭을 다 써줘야한다. 
		//	/WEB-INF/jsp/		.jsp		-> application.properties에 가면 미리 설정해 놨다. 경로 생략 가능 
		// 	/WEB-INF/jsp/lesson04/add_user.jsp
		return "lesson04/add_user"; // view 경로 
		
	}
	
	// 405 에러 : Request method 불일치  >> post 주소를 바로 치고 들어가려함. 
	// 요청 URL: http://localhost/lesson04/ex01/add_user
	@PostMapping("/lesson04/ex01/add_user")
	public String addUser(
			@RequestParam("name") String name
			, @RequestParam("yyyymmdd") String yyyymmdd
			, @RequestParam(value="email", required=false) String email
			, @RequestParam(value="introduce", required=false) String introduce
			) {
		
		// insert DB 
		userBO.addUser(name, yyyymmdd, email, introduce);
		
		
		// 결과 jsp 
		return "lesson04/after_add_user"; // 결과 jsp 경로 
		
	}
	
	// 가장 최근에 추가된 사람 한명 가져오기 
	// 요청 URL: http://localhost/lesson04/ex01/2
	@GetMapping("/lesson04/ex01/2")
	public String ex01_2(Model model) {
		// DB select - 가장 최근에 추가된 사람 한명 가져오기 
		User user = userBO.getLastUser();
		
		model.addAttribute("result", user);	 	// 결과 jsp View 화면에 결과 객체값을 내려준다 
		model.addAttribute("subject", "회원 정보");
		return "lesson04/get_last_user";
	}
	
	
}