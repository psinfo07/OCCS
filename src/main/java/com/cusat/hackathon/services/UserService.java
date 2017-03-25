package com.cusat.hackathon.services;

import com.cusat.hackathon.model.User;

public interface UserService {
		public boolean createUser(User user);
		public User userProfile(User user);
		public User userLogin(User user);
		
		public boolean updateUserDetails(User user);
		public boolean saveEduDetails(User user); 
}
