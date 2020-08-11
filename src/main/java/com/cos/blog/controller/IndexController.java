package com.cos.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


//  회원가입  로그인 으로 이동 시켜주는 라우터 
@Controller
public class IndexController {
	@GetMapping({"","/"})
	public String TestIndex() {
		System.out.println("TestIndex");
		return "index";
	}

	//auth는 특이하게 여기서 처리함
	@GetMapping("auth/joinForm")
	public String joinForm() {
		System.out.println("joinForm");
		return "user/joinForm";
	}

	@GetMapping("auth/loginForm")
	public String loginForm() {
		System.out.println("loginForm");
		return "user/loginForm";
	}

}
