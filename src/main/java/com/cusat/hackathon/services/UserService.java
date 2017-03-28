package com.cusat.hackathon.services;

import com.cusat.hackathon.model.User;

public interface UserService {
		public boolean createUser(User user);
		public User userProfile(User user);
		public User userLogin(User user);
		
		public boolean updateUserDetails(User user);
		public boolean saveEduDetails3(User user);
		public boolean saveEduDetails4(User user);  
		public boolean saveEduDetails2(User user);
		public boolean saveEduDetails1(User user);
		public boolean saveUserScore(User user,String email,String foi,int score);
}
