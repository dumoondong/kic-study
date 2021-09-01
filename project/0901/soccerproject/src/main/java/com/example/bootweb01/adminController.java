package com.example.bootweb01;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class adminController {
	
	@Autowired
	private AdminDAO dao;
	//소코드
	@RequestMapping( "commoncode.do" )
	public ModelAndView commoncode(HttpServletRequest request) {
		System.out.println( "commoncode() 호출" );
		
		ArrayList<SmallcodeTO> datas = dao.smallcodeList();
		ArrayList<LargecodeTO> datas1 = dao.LargecodeList();
		ModelAndView modelAndView = new ModelAndView( "admin/commoncode/commoncode" );
		
		modelAndView.addObject( "datas", datas ); // 소코드 리스트
		modelAndView.addObject( "datas1", datas1 ); // 대코드 정보
		return modelAndView;
	}
	//대코드
	@RequestMapping( "decode.do" )
	public ModelAndView decode(HttpServletRequest request) {
		System.out.println( "decode() 호출" );
		
		ArrayList<LargecodeTO> datas = dao.LargecodeList();
		ModelAndView modelAndView = new ModelAndView( "admin/commoncode/decode" );
		modelAndView.addObject( "datas", datas );
		return modelAndView;
	}
	//대코드수정페이지
	@RequestMapping( "decodeedit.do" )
	public ModelAndView decodeedit(HttpServletRequest request) {
		System.out.println( "decodeedit() 호출" );
		LargecodeTO to = new LargecodeTO();
		to.setSeq(request.getParameter( "seq" ) );
		//System.out.println(request.getParameter( "seq" ));
		to = dao.decodeedit( to );
		ModelAndView modelAndView = new ModelAndView("admin/commoncode/decodeedit");
		modelAndView.addObject( "to", to );
		return modelAndView;
	}
	//대코드 수정 확인
	@RequestMapping( "decodeedit_ok.do" )
	public ModelAndView decodeedit_ok(HttpServletRequest request) {
		System.out.println( "decodeedit_ok() 호출" );
		
		LargecodeTO to = new LargecodeTO();
	
		to.setSeq(request.getParameter( "seq" ) );
		to.setLargeinfo(request.getParameter( "largeinfo" ));
		to.setLargeremark(request.getParameter( "largeremark" ));
		int flag = dao.decodeedit_ok(to);
		
		ModelAndView modelAndView = new ModelAndView("admin/commoncode/decodeedit_ok");
		modelAndView.addObject( "flag", flag );
		return modelAndView;
	}
	//대코드 삭제
	@RequestMapping( "decodedelete_ok.do" )
	public ModelAndView dedcodedelete_ok(HttpServletRequest request) {
		System.out.println( "decodedelette_ok() 호출" );
		
		LargecodeTO to = new LargecodeTO();
	
		to.setSeq(request.getParameter( "seq" ) );
		int flag = dao.decodedelete_ok(to);
		
		ModelAndView modelAndView = new ModelAndView("admin/commoncode/decodedelete_ok");
		modelAndView.addObject( "flag", flag );
		return modelAndView;
	}
	//대코드 추가
	@RequestMapping( "decodewrite.do" )
	public ModelAndView decodewrite(HttpServletRequest request) {
		System.out.println( "decodedelette_ok() 호출" );
		
		LargecodeTO to = new LargecodeTO();
		to.setLargecode(request.getParameter( "largecode" ) );
		to.setLargeinfo(request.getParameter( "largeinfo" ) );
		to.setLargeremark(request.getParameter( "largeremark" ) );
		
		int flag = dao.decodewrite(to);
		
		ModelAndView modelAndView = new ModelAndView("admin/commoncode/decodewrite");
		modelAndView.addObject( "flag", flag );
		return modelAndView;
	}
	//소코드 테이블에서 대코드 검색
	@RequestMapping( "search_de.do" )
	public ModelAndView search_de(HttpServletRequest request) {
		System.out.println( "search_de() 호출" );

		String largecode = request.getParameter("largecode");
		
		ArrayList<SmallcodeTO> datas = dao.search_de(largecode);
		
		//System.out.println( request.getParameter("largecode") );	
		ModelAndView modelAndView = new ModelAndView( "admin/commoncode/search_de" );
		modelAndView.addObject( "datas", datas );
		return modelAndView;
	}
	//소코드 수정페이지
	@RequestMapping( "commoncodeEdit.do" )
	public ModelAndView commoncodeEdit(HttpServletRequest request) {
		System.out.println( "commoncodeEdit() 호출" );
		SmallcodeTO to = new SmallcodeTO();
		
		to.setSeq(request.getParameter( "seq" ) );

		to = dao.commoncodeEdit( to );
		ArrayList<LargecodeTO> datas1 = dao.LargecodeList();
		ModelAndView modelAndView = new ModelAndView("admin/commoncode/commoncodeEdit");
		
		modelAndView.addObject( "to", to );
		return modelAndView;
	}
	//소코드 수정 확인
	@RequestMapping( "commoncodeEdit_ok.do" )
	public ModelAndView commoncodeEdit_ok(HttpServletRequest request) {
		System.out.println( "commoncodeEdit_ok() 호출" );
		
		SmallcodeTO to = new SmallcodeTO();
		//System.out.println(request.getParameter( "smallinfo" ));
		//System.out.println(request.getParameter( "smallremark" ));
		to.setSeq(request.getParameter( "seq" ) );
		to.setSmallcode(request.getParameter("smallcode"));
		to.setSmallinfo(request.getParameter( "smallinfo" ));
		to.setSmallremark(request.getParameter( "smallremark" ));
		int flag = dao.commoncodeEdit_ok(to);
		
		ModelAndView modelAndView = new ModelAndView("admin/commoncode/commoncodeEdit_ok");
		modelAndView.addObject( "flag", flag );
		return modelAndView;
	}
	//소코드 삭제
	@RequestMapping( "commoncodeDelete_ok.do" )
	public ModelAndView commoncodeDelete_ok(HttpServletRequest request) {
		System.out.println( "commoncodeDelete_ok() 호출" );
		
		SmallcodeTO to = new SmallcodeTO();
	
		to.setSeq(request.getParameter( "seq" ) );
		int flag = dao.commoncodeDelete_ok(to);
		
		ModelAndView modelAndView = new ModelAndView("admin/commoncode/commoncodeDelete_ok");
		modelAndView.addObject( "flag", flag );
		return modelAndView;
	}
	//소코드 추가
	@RequestMapping( "commoncodeWrite.do" )
	public ModelAndView commoncodeWrite(HttpServletRequest request) {
		System.out.println( "decodedelette_ok() 호출" );
		
		SmallcodeTO to = new SmallcodeTO();
		to.setSmallcode(request.getParameter( "decode")+request.getParameter( "smallcode"));
		to.setSmallinfo(request.getParameter( "smallinfo" ) );
		to.setSmallremark(request.getParameter( "smallinfo" ) );
		
		int flag = dao.commoncodeWrite(to);
		
		ModelAndView modelAndView = new ModelAndView("admin/commoncode/commoncodeWrite");
		modelAndView.addObject( "flag", flag );
		return modelAndView;
	}
	//회원관리
	@RequestMapping( "management.do" )
	public ModelAndView management(HttpServletRequest request) {
		System.out.println( "management() 호출" );
		
		ArrayList<MemberTO> datas = dao.management(); 
		ArrayList<SmallcodeTO> datas1 = dao.managementcodeList();
		ModelAndView modelAndView = new ModelAndView( "admin/management/management" );
		//System.out.println(datas1);
		modelAndView.addObject( "datas", datas );
		modelAndView.addObject( "datas1", datas1 );
		return modelAndView;
	}
	
	//회원수정
	@RequestMapping( "memberedit.do" )
	public ModelAndView checkpw(HttpServletRequest request) {
		System.out.println( "memberedit() 호출" );
		MemberTO to = new MemberTO();
		ArrayList<SmallcodeTO> datas1 = dao.memberGrade();
		
		to.setSeq(request.getParameter( "seq" ) );
		to = dao.memberedit( to );
		ModelAndView modelAndView = new ModelAndView("admin/management/memberedit");
		modelAndView.addObject( "to", to );
		modelAndView.addObject( "datas1", datas1 ); // 대코드 정보
		return modelAndView;
	}
	//회원 수정 확인
	@RequestMapping( "memberedit_ok.do" )
	public ModelAndView memberedit_ok(HttpServletRequest request) {
		System.out.println( "commoncodeEdit_ok() 호출" );
		
		MemberTO to = new MemberTO();
//		System.out.println(request.getParameter( "smallinfo" ));
//		System.out.println(request.getParameter( "id" ));
//		System.out.println(request.getParameter( "name" ));
//		System.out.println(request.getParameter( "phone" ));
//		System.out.println(request.getParameter( "email" ));
		to.setSeq(request.getParameter( "seq" ) );
		to.setId(request.getParameter("id"));
		to.setName(request.getParameter( "name" ));
		to.setPhone(request.getParameter( "phone" ));
		to.setEmail(request.getParameter( "email" ));
		to.setGrade(request.getParameter( "smallinfo" ));
		int flag = dao.memberedit_ok(to);
		
		ModelAndView modelAndView = new ModelAndView("admin/management/memberedit_ok");
		modelAndView.addObject( "flag", flag );
		return modelAndView;
	}
	//회원관리 테이블에서 소코드 검색
	@RequestMapping( "search_gr.do" )
	public ModelAndView search_gr(HttpServletRequest request) {
		System.out.println( "search_gr() 호출" );

		String smallinfo = request.getParameter("smallinfo");

		ArrayList<MemberTO> datas = dao.search_gr(smallinfo);
		
		//System.out.println(smallcode);	
		ModelAndView modelAndView = new ModelAndView( "admin/management/search_gr" );
		modelAndView.addObject( "datas", datas );
		return modelAndView;
	}
}
