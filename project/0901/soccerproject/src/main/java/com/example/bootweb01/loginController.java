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
	private LoginDAO dao;
	
	@RequestMapping( "login.do" )
	public ModelAndView login(HttpServletRequest request) {
		return new ModelAndView("login/login");
	}

	@RequestMapping( "login_ok.do" )
	public ModelAndView login_ok(HttpServletRequest request) {
		System.out.println( "login_ok() 호출" );
		
		MemberTO to = new MemberTO();
		to.setId(request.getParameter( "id" ) );
		to.setPassword(request.getParameter( "password" ) );
		
		int flag = dao.memberJoinOk(to);

		ModelAndView modelAndView = new ModelAndView("login/login_ok");
		modelAndView.addObject( "flag", flag );
		modelAndView.addObject("id", to.getId());
		modelAndView.addObject("grade", to.getGrade());
		return modelAndView;
	}
	@RequestMapping( "registration.do" )
	public ModelAndView registration(HttpServletRequest request) {
		return new ModelAndView("login/registration");
	}
	
	@RequestMapping( "registration_ok.do" )
	public ModelAndView registration_ok(HttpServletRequest request) {
		System.out.println( "registration_ok() 호출" );
		
		MemberTO to = new MemberTO();
		to.setId(request.getParameter( "id" ) );
		to.setName(request.getParameter( "name" ) );
		to.setEmail(request.getParameter( "email" ) );
		to.setPhone(request.getParameter( "phone" ) );
		to.setPassword(request.getParameter( "password1" ) );
		
		int flag = dao.regiOk(to);
		
		ModelAndView modelAndView = new ModelAndView("login/registration_ok");
		modelAndView.addObject( "flag", flag );
		return modelAndView;
	}
	@RequestMapping( "idcheck.do" )
	public ModelAndView idcheck(HttpServletRequest request) {
		System.out.println( "idcheck() 호출" );
		
		MemberTO to = new MemberTO();
		to.setId(request.getParameter( "id" ) );
		int flag = dao.idcheck(to);

		ModelAndView modelAndView = new ModelAndView("login/idcheck");
		modelAndView.addObject( "flag", flag );
		return modelAndView;
	}
	@RequestMapping( "logout.do" )
	public ModelAndView logout(HttpServletRequest request) {
		return new ModelAndView("login/logout");
	}
}
