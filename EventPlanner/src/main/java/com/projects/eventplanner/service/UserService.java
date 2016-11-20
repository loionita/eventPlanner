package com.projects.eventplanner.service;

import com.projects.eventplanner.model.User;

public interface UserService {

	public User findById(String id);
	
	void saveOrUpdate(User user);
}
