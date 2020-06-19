package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.WantedPostDao;
import com.example.demo.entity.WantedPost;

@Service
public class WantedPostService {
	@Autowired
	private WantedPostDao wantedPostDao;
	
	public List<WantedPost> findAll(){
		return this.wantedPostDao.findAll();
	}
}
