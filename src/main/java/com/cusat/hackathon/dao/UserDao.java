package com.cusat.hackathon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cusat.hackathon.dbconn.DatabaseConnection;
import com.cusat.hackathon.model.User;

public class UserDao {
	public boolean createUser(User user) {
		
		Connection con = DatabaseConnection.getConnectivity();
		int i=0;
		boolean success=false;
		String query ="INSERT INTO personal_details(name,email_id,password,hqualification) VALUES(?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,user.getPersonalDetail().getName());
			ps.setString(2,user.getPersonalDetail().getEmailId());
			ps.setString(3,user.getPersonalDetail().getPassword());
			ps.setString(4,user.getPersonalDetail().getHqualification());
			 i = ps.executeUpdate();
			if(i>0) {
				success= true;
			}
		} catch (SQLException e) {
			success= false;
			e.printStackTrace();
		}
		
		return success;
	}
	
	public User userProfile(User user){
		String userId=user.getPersonalDetail().getEmailId();
		return user;
	}
}
