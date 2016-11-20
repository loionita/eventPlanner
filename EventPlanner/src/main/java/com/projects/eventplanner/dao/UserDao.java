package com.projects.eventplanner.dao;

import com.projects.eventplanner.model.User;

public interface UserDao {
	public User findById(String id);
	
	void save(User user);
}
