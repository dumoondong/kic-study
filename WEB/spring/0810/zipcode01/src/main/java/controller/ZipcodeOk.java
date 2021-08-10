package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import model1.ZipcodeDAO;
import model1.ZipcodeTO;

public class ZipcodeOk implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		String strDong = request.getParameter("dong");
		
		ZipcodeDAO dao = new ZipcodeDAO();
		ArrayList<ZipcodeTO> lists = dao.searchLists( strDong );
		
		System.out.println( "데이터 갯수 : " + lists.size() );
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "zipcode_ok" );
		modelAndView.addObject( "lists", lists );
		return modelAndView;
	}

}
