package com.projects.eventplanner.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.projects.eventplanner.dao.UserDao;
import com.projects.eventplanner.model.User;

public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	public User findById(String id) {
		return userDao.findById(id);
	}

	public void saveOrUpdate(User user) {
		userDao.save(user);
	}

}
