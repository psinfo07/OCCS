package com.cusat.hackathon.services;

import com.cusat.hackathon.dao.UserDao;
import com.cusat.hackathon.model.User;

public class UserServiceImpl implements UserService {
		
	UserDao userDao=new  UserDao();
	
	public boolean createUser(User user){
		return userDao.createUser(user);
	}

	public User userProfile(User user) {
		User u=userDao.userProfile(user);
		if(null==user){
			u.getPersonalDetail().setValid(0);
		}
		return u;
	}

	public User userLogin(User user) {
		User u=null;
		boolean isValid= userDao.userLogin(user);
		if(isValid){
			u=userProfile(user);
		}
		return u;
	}
/**
 * 
 */
	public boolean updateUserDetails(User user) {
		
		return userDao.updateUserDetails(user);
	}

public boolean saveEduDetails(User user) {
	
	return userDao.saveEduDetails(user);
}

}
