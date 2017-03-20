package com.cusat.hackathon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cusat.hackathon.dbconn.DatabaseConnection;
import com.cusat.hackathon.model.CorrespondenceAddress;
import com.cusat.hackathon.model.PermanentAddress;
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
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	
	public User userProfile(User user){
		Connection con = DatabaseConnection.getConnectivity();
	     String query = "SELECT pd.name,pd.fname,pd.mname,pd.email_id,pd.mobile,pd.password,pd.last_update_ts,pd.valid,"
	     		+ " pa.userid as pa_userId,pa.addressline1,pa.addressline2,pa.city,pa.dist,pa.state,pa.pin,"
	     		+ " ca.userid as ca_userId,ca.addressline1 as ca_add1,ca.addressline2 as ca_add2,ca.city as ca_city,ca.dist as ca_dist,ca.state as ca_state,ca.pin as ca_pin "
	     		+ " FROM personal_details pd,p_address pa,c_address ca "
	     		/*+ " WHERE pd.email_id=ca.userid "
	     		+ " AND pd.email_id=pa.userid"*/
	     		+ " WHERE pd.email_id = ? and pd.password = ? and pd.valid=?";
	     try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, user.getPersonalDetail().getEmailId());
			ps.setString(2, user.getPersonalDetail().getPassword());
			ps.setInt(3, 1);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				//User user=new User();
				//personal details
				 user.getPersonalDetail().setName(rs.getString("name"));
				 user.getPersonalDetail().setFatherName(rs.getString("fname"));
				user.getPersonalDetail().setMotherName(rs.getString("mname"));
				user.getPersonalDetail().setEmailId(rs.getString("email_id"));
				user.getPersonalDetail().setMobileNo(rs.getString("mobile"));
				user.getPersonalDetail().setPassword(rs.getString("password"));
			    user.getPersonalDetail().setLastUpdateTs(null);
			    user.getPersonalDetail().setValid(rs.getInt("valid"));
				
				//permanent address
				
			    PermanentAddress pa= new PermanentAddress();
			    user.setPermanentAddress(pa);
			    user.getPermanentAddress().setUserId(rs.getString(9));
			    user.getPermanentAddress().setAddressLine1(rs.getString(10));
				user.getPermanentAddress().setAddressLine2(rs.getString(11));
				user.getPermanentAddress().setCity(rs.getString(12));
				user.getPermanentAddress().setDist(rs.getString(13));
				user.getPermanentAddress().setState(rs.getString(14));
			    user.getPermanentAddress().setPin(rs.getString(15));
				
				//correspondence address
			    CorrespondenceAddress ca=new CorrespondenceAddress();
			    user.setCorrespondenceAddress(ca);
				user.getCorrespondenceAddress().setUserId(rs.getString(16));
				user.getCorrespondenceAddress().setAddressLine2(rs.getString(17));
				user.getCorrespondenceAddress().setAddressLine2(rs.getString(18));
				user.getCorrespondenceAddress().setCity(rs.getString(19));
				user.getCorrespondenceAddress().setDist(rs.getString(20));
				user.getCorrespondenceAddress().setState(rs.getString(21));
				user.getCorrespondenceAddress().setPin(rs.getString(22));
			}else{
				user=null;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
	}
	
   public boolean userLogin(User user){
	   Connection con = DatabaseConnection.getConnectivity();
	   String query = "select * from personal_details where email_id = ? and password = ? and valid=?";
	   boolean isValid=false;
	   try {
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, user.getPersonalDetail().getEmailId());
		ps.setString(2, user.getPersonalDetail().getPassword());
		ps.setInt(3, 1);
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			isValid=true;
		}
		} catch (SQLException e) {
		e.printStackTrace();
	}
	return isValid;
	   
   }
}
