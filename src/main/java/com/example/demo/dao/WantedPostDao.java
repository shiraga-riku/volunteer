package com.example.demo.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.entity.PostUser;
import com.example.demo.entity.WantedPost;

@ConfigAutowireable
@Dao
public interface WantedPostDao {
	@Select
	List<PostUser> findAll();

	@Insert
	int insert(WantedPost wantedPost);
}
