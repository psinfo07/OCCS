package com.cusat.hackathon.dao;

import com.cusat.hackathon.model.User;

public class UserDao {
	public boolean createUser(User user){
		return true;
	}
	
	public User userProfile(User user){
		String userId=user.getPersonalDetail().getEmailId();
		return user;
	}
}
