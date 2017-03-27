package com.cusat.hackathon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.cusat.hackathon.dbconn.DatabaseConnection;
import com.cusat.hackathon.model.Question;
import com.cusat.hackathon.model.User;

public class QuestionDao {
			public List<Question> getQuestionById(String userid){
				Connection con = DatabaseConnection.getConnectivity();				
				String query ="select foi1,foi2,foi3,foi4 from foi where userid=?";
				String query2 ="select * from question where s_code in(?,?,?,?)";
				
				List<Question> questions= new ArrayList<Question>();
				
				try
				{
					PreparedStatement ps=con.prepareStatement(query);
					PreparedStatement ps2=con.prepareStatement(query2);
					ps.setString(1,userid);
					ResultSet rs=ps.executeQuery();	
					String foi1=null;
					String foi2=null;
					String foi3=null;
					String foi4=null;
					while(rs.next()){
						 foi1=rs.getString(1);
						 foi2=rs.getString(2);
						 foi3=rs.getString(3);
						 foi4=rs.getString(4);
					}
					
					ps2.setString(1,foi1);
					ps2.setString(2,foi2);
					ps2.setString(3,foi3);
					ps2.setString(4,foi4);
					
					ResultSet rs2=ps2.executeQuery();					
					while(rs2.next()){
						Question question= new Question();	
						String str1=rs2.getString(2);
						question.setQuestion(rs2.getString(2));
						question.setOption1(rs2.getString(3));
						question.setOption2(rs2.getString(4));
						question.setOption3(rs2.getString(5));
						question.setOption4(rs2.getString(6));
						question.setAnswer(rs2.getString(7));
						questions.add(question);
					}				
				}
				catch(Exception ex){
					System.out.println("ERROR");
				}
								
				return questions;
			}
}