package com.cos.blog.repository;

import com.cos.blog.model.User;

public interface UserRepository {
      // 퍼시스턴스를 만들어줌 ??
	public void save(User user);
	public User login(User user);
}
