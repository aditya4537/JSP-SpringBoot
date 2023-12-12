package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.Mobile;


@Controller
public class MobileController {
	
	@Autowired
	private Mobile m;
	
	@GetMapping("/mobile")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("mobile", m.details());
		System.out.println(m.details());
		return mv;
	}
}
