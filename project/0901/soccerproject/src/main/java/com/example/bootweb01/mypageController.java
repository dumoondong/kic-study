package com.example.bootweb01;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class mypageController {
	
	@Autowired
	private mypageDAO dao;
	//내정보
	@RequestMapping( "mypage.do" )
	public ModelAndView mypage(HttpServletRequest request) {
		System.out.println( "mypage() 호출" );
		MemberTO to = new MemberTO();
		
		to.setId(request.getParameter("id"));
		to = dao.mypageView( to );
		ModelAndView modelAndView = new ModelAndView( "mypage/mypage" );
		modelAndView.addObject( "to", to );
		return modelAndView;
	}
	//핸드폰번호 변경
	@RequestMapping( "mypage_phone.do" )
	public ModelAndView mypage_phone(HttpServletRequest request) {
		System.out.println( "mypage_phone() 호출" );
		
		MemberTO to = new MemberTO();
		
		to.setId(request.getParameter( "id" ) );
		to.setPhone(request.getParameter( "phone" ) );
		
		int flag = dao.changephone(to);
		
		ModelAndView modelAndView = new ModelAndView("mypage/mypage_phone");
		modelAndView.addObject( "flag", flag );
		return modelAndView;
	}
	//이메일 변경
	@RequestMapping( "mypage_email.do" )
	public ModelAndView mypage_email(HttpServletRequest request) {
		System.out.println( "mypage_email() 호출" );
		
		MemberTO to = new MemberTO();
		
		to.setId(request.getParameter( "id" ) );
		to.setEmail(request.getParameter( "email" ) );
		int flag = dao.changeemail(to);
		
		ModelAndView modelAndView = new ModelAndView("mypage/mypage_email");
		modelAndView.addObject( "flag", flag );
		return modelAndView;
	}
	//이름 변경
	@RequestMapping( "mypage_name.do" )
	public ModelAndView mypage_name(HttpServletRequest request) {
		System.out.println( "mypage_name() 호출" );
		
		MemberTO to = new MemberTO();
		
		to.setId(request.getParameter( "id" ) );
		to.setName(request.getParameter( "name" ) );

		int flag = dao.changename(to);
		
		ModelAndView modelAndView = new ModelAndView("mypage/mypage_name");
		modelAndView.addObject( "flag", flag );
		return modelAndView;
	}
	
	//비밀번호 확인 페이지
	@RequestMapping( "checkpw.do" )
	public ModelAndView checkpw(HttpServletRequest request) {
		return new ModelAndView("mypage/checkpw");
	}
	//비밀번호 확인
	@RequestMapping( "checkpw_ok.do" )
	public ModelAndView checkpw_ok(HttpServletRequest request) {
		System.out.println( "checkpw_ok() 호출" );
		
		MemberTO to = new MemberTO();
		to.setId(request.getParameter( "id" ) );
		to.setPassword(request.getParameter( "password" ) );
		
		int flag = dao.checkpw(to);
		
		ModelAndView modelAndView = new ModelAndView("mypage/checkpw_ok");
		modelAndView.addObject( "flag", flag );
		modelAndView.addObject("id", to.getId());
		return modelAndView;
	}
	//비밀번호 변경 페이지
	@RequestMapping( "changepw.do" )
	public ModelAndView changepw(HttpServletRequest request) {
		return new ModelAndView("mypage/changepw");
	}
	//비밀번호 변경
	@RequestMapping( "changepw_ok.do" )
	public ModelAndView changepw_ok(HttpServletRequest request) {
		System.out.println( "checkpw_ok() 호출" );
		
		MemberTO to = new MemberTO();
		to.setId(request.getParameter( "id" ) );
		to.setPassword(request.getParameter( "password1" ) );
		
		System.out.println(request.getParameter( "id" ));
		System.out.println(request.getParameter( "password1" ));
		
		int flag = dao.changepw(to);
		
		ModelAndView modelAndView = new ModelAndView("mypage/changepw_ok");
		modelAndView.addObject( "flag", flag );
		return modelAndView;
	}
	
	
}
