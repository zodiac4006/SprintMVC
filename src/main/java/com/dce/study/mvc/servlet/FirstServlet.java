package com.dce.study.mvc.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstServlet {
	@RequestMapping("/first") 
	public String firstFunction(){
		System.out.println("invoke the first function!");
		return "redirect:/jsp/error.jsp";
	}
}
