package com.cusat.hackathon.services;

import com.cusat.hackathon.model.User;

public interface UserService {
		public boolean createUser(User user);
		public User userProfile(User user);
}
