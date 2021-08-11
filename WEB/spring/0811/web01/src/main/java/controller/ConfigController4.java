package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/board")
public class ConfigController4 {

		@RequestMapping("/list1.do")
		public ModelAndView handleRequest1() {
			System.out.println("handleRequest1() 호출");
			
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("listview5");
			return modelAndView;
		}
		
		@RequestMapping("/list2.do")
		public ModelAndView handleRequest2() {
			System.out.println("handleRequest2() 호출");
			
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("listview6");
			return modelAndView;
		}
		
		@RequestMapping("/list3.do")
		public String handleRequest3() {
			System.out.println("handleRequest2() 호출");
			
			return "redirect:https://www.daum.net";
		}
}
