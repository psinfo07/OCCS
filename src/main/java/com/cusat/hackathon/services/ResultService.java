package com.cusat.hackathon.services;

import com.cusat.hackathon.model.Result;
import com.cusat.hackathon.model.User;

public interface ResultService {

	/**
	 * 
	 * @param user
	 * @return
	 */
	public Result fetchResult(User user);
}
