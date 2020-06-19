package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.PostUser;
import com.example.demo.service.UserService;
import com.example.demo.service.WantedPostService;

@Controller
@RequestMapping("/post")
public class WantedPostController {
	@Autowired
	WantedPostService postService;
	@Autowired
	UserService userService;

	@GetMapping("/list")
	public String list(Model model) {
		List<PostUser> postUser = postService.findAll();
		model.addAttribute("wantedPostList", postUser);
		return "post/list.html";
	}
}
