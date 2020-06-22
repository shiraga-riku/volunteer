package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.WantedPostDao;
import com.example.demo.entity.PostUser;
import com.example.demo.entity.WantedPost;

@Service
public class WantedPostService {
	@Autowired
	private WantedPostDao wantedPostDao;

	public List<PostUser> findAll() {
		return this.wantedPostDao.findAll();
	}
	
	public PostUser findBy(Integer id) {
		return this.wantedPostDao.findBy(id);
	}

	@Transactional
	public WantedPost create(WantedPost wantedPost) {
		wantedPostDao.insert(wantedPost);
		return wantedPost;
	}
}
