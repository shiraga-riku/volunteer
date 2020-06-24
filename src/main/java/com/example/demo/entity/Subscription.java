package com.example.demo.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

@Entity
@Table(name = "subscriptions")
public class Subscription {
	@Id
	@Column(name = "user_id")
	private Integer userId;

	@Id
	@Column(name = "wanted_post_id")
	private Integer wantedPostId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getWantedPostId() {
		return wantedPostId;
	}

	public void setWantedPostId(Integer wantedPostId) {
		this.wantedPostId = wantedPostId;
	}

}
