package com.cusat.hackathon.services;

import java.util.Set;

import com.cusat.hackathon.dao.UserDao;
import com.cusat.hackathon.model.EduDetail;
import com.cusat.hackathon.model.User;

public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDao();

	public boolean createUser(User user) {
		return userDao.createUser(user);
	}

	public User userProfile(User user) {
		User u = userDao.userProfile(user);
		if (null == user) {
			u.getPersonalDetail().setValid(0);
		}
		return u;
	}

	public User userLogin(User user) {
		User u = null;
		boolean isValid = userDao.userLogin(user);
		if (isValid) {
			u = userProfile(user);
		}
		return u;
	}

	
	public boolean updateUserDetails(User user) {

		return userDao.updateUserDetails(user);
	}

	public boolean saveEduDetails3(User user) {

		return userDao.saveEduDetails3(user);
	}

	public boolean saveEduDetails4(User user) {
		return userDao.saveEduDetails4(user);
	}

	public boolean saveEduDetails2(User user) {
		return userDao.saveEduDetails2(user);
	}

	public boolean saveEduDetails1(User user) {
		return userDao.saveEduDetails1(user);
	}
	public boolean saveTenthDetail(User user){
		return userDao.saveTenthDetail(user);
	}

	public boolean saveUserScore(User user, String email, String foi, int score) {
		return userDao.saveUserScore(user, email, foi, score);
	}
	public boolean saveContact(String name, String email,String subject, String message){
		return userDao.saveContact( name,email,subject,message);
	
   }

	public Set<EduDetail> getEduDetails(User user) {
		 return userDao.getEduDetails(user);
	}
}