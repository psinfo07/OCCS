package com.cusat.hackathon.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	
	private static Connection con = null;
	
	static {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
		} catch (ClassNotFoundException e){
			System.out.println("Class not loaded "+e);
		}
		
	}
	public static Connection getConnectivity(){
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocsproject", "root", "root");
			System.out.println("connection successful"); 
		} catch (SQLException e) {
			System.out.println("ERROR: Unable to Connect to Database.");
		}
		
		return con;
	}
	public static void closeConnectivity() {
		try{
			con.close();
		}catch(SQLException e){
			System.out.println("Connection not closed "+ e);
		}
		
	}
	/**public static void main(String args[]){
		getConnectivity();
	}*/
}
