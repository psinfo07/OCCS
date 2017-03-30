package com.cusat.hackathon.services;

import com.cusat.hackathon.dao.ResultDao;
import com.cusat.hackathon.model.Result;
import com.cusat.hackathon.model.User;

public class ResultServiceImpl  implements ResultService{
	
	/**
	 * 
	 */
	ResultDao resultDao=new ResultDao();
	public Result fetchResult(User user) {		
		return resultDao.fetchResult(user);
	}

	
}
