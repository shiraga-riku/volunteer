package com.example.demo.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

//バリデーションかける
public class WantedPostForm {
	private Integer wanted_post_id;

	@NotEmpty
	private String title;

	@NotEmpty
	private String post;

	@NotNull
	private Integer wanted_people;

	private Integer user_id;

	public Integer getWanted_post_id() {
		return wanted_post_id;
	}

	public void setWanted_post_id(Integer wanted_post_id) {
		this.wanted_post_id = wanted_post_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public Integer getWanted_people() {
		return wanted_people;
	}

	public void setWanted_people(Integer wanted_people) {
		this.wanted_people = wanted_people;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

}
