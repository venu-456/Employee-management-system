package com.example.app.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
	public class controller {
		@RequestMapping("/")
		public ModelAndView index() {
			ModelAndView mv= new ModelAndView();
			mv.setViewName("jsptest.jsp");
			return mv;
		}
	}
