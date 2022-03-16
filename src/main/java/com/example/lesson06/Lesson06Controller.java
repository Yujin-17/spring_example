package com.example.lesson06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.lesson04.bo.UserBO;

@RequestMapping("/lesson06/ex01")
@Controller
public class Lesson06Controller {

	
	@Autowired
	private UserBO userBO;
	// 유저 추가 화면
	// 요청 URL: http://localhost/lesson06/ex01/add_user_view
	@RequestMapping("/add_user_view")
	public String addUserView() {
		return "lesson06/add_new_user";
	}
	
	// 유저 추가 
	// 요청 URL: http://localhost/lesson06/ex01/add_user
	// AJAX가 요청하는 경우 @ResponseBody이 있어야 한다. 
	// AJAX가 요청하는 응답값은 String이다. 
	@ResponseBody
	@PostMapping("/add_user") 	// 메소드는 type에 있는것과 반드시 매핑 
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam("email") String email,
			@RequestParam(value="introduce", required=false) String introduce) { // 필수 아닌 파라미터. 
		
		// TODO insert db
		
		userBO.addUser(name, yyyymmdd, email, introduce);
		
		return "성공";	 // breakPoint 설정 후 끝내는 것 > f8 누르면 끝남. 
	}
	
	@RequestMapping("/get_user_view")
	public String getUserView() {
		return "lesson06/get_user";
	}
	
}
