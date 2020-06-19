package com.example.demo.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Entity
@Table(name = "wanted_posts")
public class WantedPost {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "wanted_post_id")
	private Integer wanted_post_id;

	@Column(name = "title")
	private String title;

	@Column(name = "post")
	private String post;

	@Column(name = "wanted_people")
	private Integer wanted_people;

	@Column(name = "user_id")
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
