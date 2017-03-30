package com.cusat.hackathon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cusat.hackathon.dbconn.DatabaseConnection;
import com.cusat.hackathon.model.Result;
import com.cusat.hackathon.model.User;

public class ResultDao {

	public Result fetchResult(User user) {		
		String query="select scorefoi1,scorefoi2,scorefoi3,scorefoi4 from result where userid=?";
		Connection con=DatabaseConnection.getConnectivity();
		Result result=new Result();
		try 
		{
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,user.getPersonalDetail().getEmailId());
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				result.setScoreFoi1(rs.getInt("scorefoi1"));
				result.setScoreFoi2(rs.getInt("scorefoi2"));
				result.setScoreFoi3(rs.getInt("scorefoi3"));
				result.setScoreFoi4(rs.getInt("scorefoi4"));				
			}
			else
			{
				result=null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	
}
