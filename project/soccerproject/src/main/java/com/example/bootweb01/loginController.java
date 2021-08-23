package com.example.bootweb01;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class loginController {
	
	@Autowired
	private BoardDAO dao;

	@RequestMapping( "login.do" )
	public ModelAndView login(HttpServletRequest request) {
		return new ModelAndView("login/login");
	}
	@RequestMapping( "registration.do" )
	public ModelAndView registration(HttpServletRequest request) {
		return new ModelAndView("login/registration");
	}
}
