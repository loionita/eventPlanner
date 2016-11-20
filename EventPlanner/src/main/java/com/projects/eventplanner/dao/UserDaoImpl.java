package com.projects.eventplanner.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.projects.eventplanner.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{

	@PersistenceContext
	private EntityManager em;
	
	public User findById(String id) {
		return em.find(User.class, id);
	}

	public void save(User user) {
		em.merge(user);
	}

}
