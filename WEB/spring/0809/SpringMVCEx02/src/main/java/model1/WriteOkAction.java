package model1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WriteOkAction implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		//arg0.setCharacterEncoding("utf-8");
		
		System.out.println(arg0.getParameter("data"));
		
		System.out.println("handleRequest() 호출");
		
		//arg0.setAttribute("data", arg0.getParameter("data"));
		//return new ModelAndView("write_ok");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("write_ok");
		modelAndView.addObject("data",arg0.getParameter("data"));
		return modelAndView;
	}

}
