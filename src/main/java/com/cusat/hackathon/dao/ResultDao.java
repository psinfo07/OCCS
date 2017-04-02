package com.cusat.hackathon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cusat.hackathon.dbconn.DatabaseConnection;
import com.cusat.hackathon.model.Result;
import com.cusat.hackathon.model.User;

public class ResultDao {

	/**
	 * 
	 * @param user
	 * @return
	 */
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
				
				String str="foi1";
				int greatest =rs.getInt("scorefoi1");
				if(greatest<rs.getInt("scorefoi2")){
					greatest=rs.getInt("scorefoi2");
					str="foi2";
				}
				if(greatest<rs.getInt("scorefoi3")){
					greatest=rs.getInt("scorefoi3");
					str="foi3";
				}			
				if(greatest<rs.getInt("scorefoi4")){
					greatest=rs.getInt("scorefoi4");
					str="foi4";
				}
				
				result.setCollegeNames(fetchCollegeNames(user,str));
				result.setSub1(fetchSubjectNames(user,"foi1"));
				result.setSub2(fetchSubjectNames(user,"foi2"));
				result.setSub3(fetchSubjectNames(user,"foi3"));
				result.setSub4(fetchSubjectNames(user,"foi4"));
				result.setMaxMarks(String.valueOf(greatest));
				
				result.setMaxMarksIn(fetchSubjectNames(user,str));
				
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
	public String fetchCollegeNames(User user,String str)
	{
		String query="SELECT college FROM colleges WHERE s_code = (SELECT "+str+" FROM `foi` WHERE userid=?)";
		String collegeNames="";
		Connection con=DatabaseConnection.getConnectivity();		
		try {
			int i = 1;
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1,user.getPersonalDetail().getEmailId());
				ResultSet rs=ps.executeQuery();
				while(rs.next())
				{
					collegeNames+=" \n("+ i+").  "+rs.getString("college")+".";
					i++;
				}
		} catch (SQLException e) {			
			e.printStackTrace();
		}		
		return collegeNames;
	}
public String fetchSubjectNames(User user, String str){
	String query = "SELECT s_name from sector where s_code = (SELECT "+str+" FROM `foi` WHERE userid=?)";
	String subName="";
	Connection con = DatabaseConnection.getConnectivity();
	try {
		String s_name = "s_name";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, user.getPersonalDetail().getEmailId());
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			subName = rs.getString(s_name);
		}else{
			subName=null;
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return subName;
	
}
	
}
