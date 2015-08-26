package com.dce.study.mvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


public class TestDispatcherServlet extends DispatcherServlet {
	@Override
	protected WebApplicationContext initWebApplicationContext() {
		System.out.println(111);
		return super.initWebApplicationContext();
	}
}
