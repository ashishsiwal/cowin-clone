package com.practice.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.practice.test.model.UserMobileNumber;
import com.practice.test.service.UserAuthenticationService;

@Controller
public class HomeController {	
	@Autowired
	UserAuthenticationService userAuthenticationService;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@PostMapping("/getOTP")
	public String getOTP(ModelMap model, HttpServletRequest request) {
		model.addAttribute("mobNumber", request.getParameter("mobNumber"));

		Object mobileNumber = model.getAttribute("mobNumber");

		 String result = userAuthenticationService.getOTP(mobileNumber.toString());
		model.addAttribute("result", result);
		return "getOTP";
	}
}
