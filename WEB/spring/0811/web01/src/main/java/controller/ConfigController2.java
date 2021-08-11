package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConfigController2 {

		@RequestMapping("/list3.do")
		public String handleRequest1() {
			System.out.println("handleRequest1() 호출");
			return "listview3";
		}
		
		@RequestMapping("/list4.do")
		public String handleRequest2() {
			System.out.println("handleRequest1() 호출");
			return "listview4";
		}
}
