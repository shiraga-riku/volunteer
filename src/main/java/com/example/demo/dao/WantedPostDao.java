package com.example.demo.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.entity.PostUser;
import com.example.demo.entity.Subscription;
import com.example.demo.entity.WantedPost;

@ConfigAutowireable
@Dao
public interface WantedPostDao {
	@Select
	List<PostUser> findAll();

	@Select
	PostUser findBy(Integer id);

	@Select
	Subscription findSubscription(Integer userId, Integer wantedPostId);

	@Insert
	int insert(WantedPost wantedPost);

	@Insert
	int subscript(Subscription subscript);

	@Delete
	int unSubscript(Subscription subscript);
}
