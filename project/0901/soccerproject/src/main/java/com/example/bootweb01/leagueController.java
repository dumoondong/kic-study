package com.example.bootweb01;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class leagueController {
	
	@Autowired
	private LoginDAO dao;
	
	@RequestMapping( "league.do" )
	public ModelAndView leauge(HttpServletRequest request) {
		return new ModelAndView("leaguecup/league");
	}
	@RequestMapping( "leaguelaliga.do" )
	public ModelAndView leaugelaliga(HttpServletRequest request) {
		return new ModelAndView("leaguecup/leaguelaliga");
	}
	@RequestMapping( "leaguebundesliga.do" )
	public ModelAndView leaguebundesliga(HttpServletRequest request) {
		return new ModelAndView("leaguecup/leaguebundesliga");
	}
	@RequestMapping( "leagueserieA.do" )
	public ModelAndView leagueserieA(HttpServletRequest request) {
		return new ModelAndView("leaguecup/leagueserieA");
	}
	
	/*EPL*/
	@RequestMapping( "Arsenal.do" )
	public ModelAndView Arsenal(HttpServletRequest request) {
		return new ModelAndView("EPL/Arsenal");
	}
	@RequestMapping( "Mancity.do" )
	public ModelAndView Mancity(HttpServletRequest request) {
		return new ModelAndView("EPL/Mancity");
	}
	@RequestMapping( "Liverpool.do" )
	public ModelAndView Liverpool(HttpServletRequest request) {
		return new ModelAndView("EPL/Liverpool");
	}
}
