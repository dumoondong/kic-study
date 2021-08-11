package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConfigController3 {

		@RequestMapping("/list5.do")
		public ModelAndView handleRequest1() {
			System.out.println("handleRequest1() 호출");
			
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("listview5");
			return modelAndView;
		}
		
		@RequestMapping("/list6.do")
		public ModelAndView handleRequest2() {
			System.out.println("handleRequest2() 호출");
			
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("listview6");
			return modelAndView;
		}
}
