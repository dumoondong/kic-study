package controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConfigController {

	@RequestMapping("/write.do")
	public ModelAndView write() {
		return new ModelAndView("write");
	}
	
	/*
	@RequestMapping(value="/write_ok.do", method=RequestMethod.GET)
	public ModelAndView write_ok1(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("GET 방식 : " + request.getParameter("data"));
		
		ModelAndView modelAndView = new ModelAndView("write_ok");
		modelAndView.addObject("data",request.getParameter("data"));
		return modelAndView;
	}
	
	@RequestMapping(value="/write_ok.do", method=RequestMethod.POST)
	public ModelAndView write_ok2(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("POST 방식 : " + request.getParameter("data"));
		
		ModelAndView modelAndView = new ModelAndView("write_ok");
		modelAndView.addObject("data",request.getParameter("data"));
		return modelAndView;
	}
	*/
	/*
	@RequestMapping(value="/write_ok.do", method=RequestMethod.GET)
	public String write_ok1(HttpServletRequest request, HttpServletResponse response, Model model) {
		System.out.println("GET 방식 : " + request.getParameter("data"));
		
		model.addAttribute("data",request.getParameter("data"));
		return "write_ok";
	}
	*/
	/*
	@RequestMapping(value="/write_ok.do", method=RequestMethod.GET)
	public String write_ok1(@RequestParam("data") String data,Model model) {
		System.out.println("GET 방식 : " + data);
		
		model.addAttribute("data",data);
		return "write_ok";
	}
	*/
	@RequestMapping(value="/write_ok.do", method=RequestMethod.GET)
	public String write_ok1(String data, Locale locale, Model model) {
		System.out.println("GET 방식 : " + data);
		
		model.addAttribute("data",data);
		return "write_ok";
	}

}
