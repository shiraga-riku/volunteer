package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.PostUser;
import com.example.demo.entity.WantedPost;
import com.example.demo.form.WantedPostForm;
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

	@GetMapping("/create")
	public String showCreate(Model model) {
		model.addAttribute("wantedPostForm", new WantedPostForm());
		return "post/create.html";
	}

	@PostMapping("/create")
	public String create(@AuthenticationPrincipal UserDetails userDetails, @Validated WantedPostForm wantedPostForm, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "post/create.html";
		}
		WantedPost wantedPost = new WantedPost();
		Integer userId = userService.findUserId(userDetails.getUsername()).getUserId();
		wantedPost.setTitle(wantedPostForm.getTitle());
		wantedPost.setPost(wantedPostForm.getPost());
		wantedPost.setWanted_people(wantedPostForm.getWanted_people());
		wantedPost.setUser_id(userId);
		postService.create(wantedPost);
		return "redirect:/post/list";
	}
	
	@GetMapping("{id}")
	public String show(Model model,@PathVariable Integer id) {
		PostUser postUser = postService.findBy(id);
		model.addAttribute("wantedPost", postUser);
		return "post/show.html";
	}
}
