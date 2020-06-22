package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/menu")
public class MenuController {
	@Autowired
	UserService userService;

	@RequestMapping
	public String menu(@AuthenticationPrincipal UserDetails userDetails, Model model) {
		User user = userService.findUserId(userDetails.getUsername());
		model.addAttribute("user", user);
		return "menu/index.html";
	}
}