package com.cg.naagshakti.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.naagshakti.beans.Student;
import com.cg.naagshakti.service.OnlineCoursesServices;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	OnlineCoursesServices service;

	@RequestMapping(value = "signin", method = RequestMethod.GET)
	public String Login(@ModelAttribute("Student") Student student) {
		return "login.jsp";
	}

	@RequestMapping(value = "signindetails", method = RequestMethod.POST)
	public String LoginDetails(@ModelAttribute("customer") Student student, ModelMap model,
			HttpServletRequest request) {
		String page = "";

		page = "homepage";

		return page;
	}

}
