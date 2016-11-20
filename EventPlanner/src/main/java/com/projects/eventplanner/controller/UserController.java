package com.projects.eventplanner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projects.eventplanner.model.User;
import com.projects.eventplanner.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/user{id}", method = RequestMethod.GET)
	public User getUser(@PathVariable("id") String id) {
		return userService.findById(id);
	}
	
	@RequestMapping(value = "/signup/user", method=RequestMethod.PUT)
	public User createUser(User user){
		userService.saveOrUpdate(user);
		
		return user;
	}
}
