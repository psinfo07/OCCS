package com.cusat.hackathon.services;

import com.cusat.hackathon.dao.UserDao;
import com.cusat.hackathon.model.User;

public class UserServiceImpl implements UserService {
		
	UserDao userDao=new  UserDao();
	
	public boolean createUser(User user) {
		return userDao.createUser(user);
	}

}
