package com.cusat.hackathon.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cusat.hackathon.dbconn.DatabaseConnection;
import com.cusat.hackathon.model.Certification;
import com.cusat.hackathon.model.CorrespondenceAddress;
import com.cusat.hackathon.model.EduDetail;
import com.cusat.hackathon.model.PermanentAddress;
import com.cusat.hackathon.model.User;

public class UserDao {
	public boolean createUser(User user){
		
		Connection con = DatabaseConnection.getConnectivity();
		int i=0;
		boolean success=false;
		String query ="INSERT INTO personal_details(name,email_id,password,hqualification) VALUES(?,?,?,?)";
		
		try {
			con.setAutoCommit(false);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,user.getPersonalDetail().getName());
			ps.setString(2,user.getPersonalDetail().getEmailId());
			ps.setString(3,user.getPersonalDetail().getPassword());
			ps.setString(4,user.getPersonalDetail().getHqualification());
			 i = ps.executeUpdate();
			if(i>0) {
				if(saveCaddress(con,user)
					&& savePAddress(con,user)
					&& saveResult(con,user)
					&& saveStudentEducationDetails(con,user)){
					success= true;
					con.commit();
				}else{
					con.rollback();
				}
				
				
			}
		} catch (Exception e) {
			try {
				con.rollback();
			} catch (SQLException e1) {
				success= false;
			}
			
			success= false;
			e.printStackTrace();
		}
		
		return success;
	}
	
	//Save correspondance address
	public boolean saveCaddress(Connection con,User user) {
	String query = "INSERT INTO c_address(userid) VALUES(?)";
	int i=0;
	boolean success = false;
	try{
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, user.getPersonalDetail().getEmailId());
		i = ps.executeUpdate();
		if(i>0){
			success = true;
		}
	}catch(SQLException e){
		success = false;
		e.printStackTrace();
	}
	return success;
	}
	
	//Save Permanent Address
	public boolean savePAddress(Connection con,User user) {
		String query = " INSERT INTO p_address(userid) VALUES(?)";
		int i = 0;
		boolean success = false;
		try{
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,user.getPersonalDetail().getEmailId());
			i = ps.executeUpdate();
			if(i>0){
				success = true;
			}
		}catch(SQLException e){
			success = false;
			e.printStackTrace();
		}
		return success;
	}
	
	// Save Result
   public boolean saveResult(Connection con,User user) {
	   String query = " INSERT INTO result(userid) VALUES(?)";
		int i = 0;
		boolean success = false;
		try{
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,user.getPersonalDetail().getEmailId());
			i = ps.executeUpdate();
			if(i>0){
				success = true;
			}
		}catch(SQLException e){
			success = false;
			e.printStackTrace();
		}
		return success;
	}
   
   //Save Educational Details
   public boolean saveStudentEducationDetails(Connection con,User user) {
	   String query = " INSERT INTO student_edu_detail(userid) VALUES(?)";
		int i = 0;
		boolean success = false;
		try{
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,user.getPersonalDetail().getEmailId());
			i = ps.executeUpdate();
			if(i>0){
				success = true;
			}
		}catch(SQLException e){
			success = false;
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
	     		+ " WHERE pd.email_id=ca.userid "
	     		+ " AND pd.email_id=pa.userid"
	     		+ " AND pd.email_id = ? and pd.password = ? and pd.valid=?";
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
			saveLogDetails(con,user);
		}
		} catch (SQLException e) {
		e.printStackTrace();
	}
	return isValid;
   }
   
   
   public boolean saveLogDetails(Connection con, User user){
	   String query = "INSERT INTO log(userid) VALUES(?)";
	   int i=0;
	   boolean success = false;
	   try{
		   PreparedStatement ps = con.prepareStatement(query);
		   ps.setString(1, user.getPersonalDetail().getEmailId());
		   i = ps.executeUpdate();
		   if(i>0){
			   success = true;
		   }
	   }catch (Exception e) {
		   success = false;
	}
	return success;
	   
   }
   
   
   public boolean updateUserDetails(User user){
		Connection con = DatabaseConnection.getConnectivity();
		boolean success1=updatePersonalDetail(con,user) ;
		boolean success2=updatePermanentAddress(con, user);
		boolean success3=updateCorrespondenseAddress(con, user);
		boolean success = (success1	||  success2 || success3)?true:false;
		
		return success;
	}
   
   /**
    * update personal deatils
    * @param con
    * @param user
    * @return
    */
   public boolean updatePersonalDetail(Connection con , User user){
	   String query = "UPDATE  personal_details set name=?, fname=?,mname=?,mobile=? WHERE email_id=?";
	   int i=0;
	   boolean success=false;
	   try{
		   	   PreparedStatement ps=con.prepareStatement(query);
			   ps.setString(1,user.getPersonalDetail().getName());
			   ps.setString(2,user.getPersonalDetail().getFatherName());
			   ps.setString(3,user.getPersonalDetail().getMotherName());
			   ps.setString(4, user.getPersonalDetail().getMobileNo());
			   ps.setString(5,user.getPersonalDetail().getEmailId());
			   i = ps.executeUpdate();
			   if(i>0){
				   	success=true;
			   }
	   }catch(SQLException e){
		   success = false;
	   }
	return success;
	   
   }
   /**
    * Update permanent address
    * @param con
    * @param user
    * @return
    */
   public boolean updatePermanentAddress(Connection con, User user){
	   String query = "UPDATE p_address SET addressline1=?,addressline2=?,city=?,dist=?,state=?,pin=? WHERE userid=?";
	   boolean success = false;
	   int i=0;
	   try{
		      PreparedStatement ps=con.prepareStatement(query);
			  ps.setString(1,user.getPermanentAddress().getAddressLine1());
			  ps.setString(2, user.getPermanentAddress().getAddressLine2());
			  ps.setString(3,user.getPermanentAddress().getCity());
			  ps.setString(4,user.getPermanentAddress().getDist());
			  ps.setString(5,user.getPermanentAddress().getState());
			  ps.setString(6,user.getPermanentAddress().getPin());
			  ps.setString(7, user.getPermanentAddress().getUserId());
			  i = ps.executeUpdate();
			  if(i>0){
				  success = true;
			  }
	   }catch (SQLException e) {
		   success = false;
	}
	   return success;
   }
 
   /**
    * Update correspondence  address
    * @param con
    * @param user
    * @return
    */
   public boolean updateCorrespondenseAddress(Connection con, User user){
	   String query = "UPDATE c_address SET addressline1=?,addressline2=?,city=?,dist=?,state=?,pin=? WHERE userid=?";
	   boolean success = false;
	   int i=0;
	   try{
		      PreparedStatement ps=con.prepareStatement(query);
			  ps.setString(1,user.getCorrespondenceAddress().getAddressLine1());
			  ps.setString(2, user.getCorrespondenceAddress().getAddressLine2());
			  ps.setString(3,user.getCorrespondenceAddress().getCity());
			  ps.setString(4,user.getCorrespondenceAddress().getDist());
			  ps.setString(5,user.getCorrespondenceAddress().getState());
			  ps.setString(6,user.getCorrespondenceAddress().getPin());
			  ps.setString(7, user.getCorrespondenceAddress().getUserId());
			  i = ps.executeUpdate();
			  if(i>0){
				  success = true;
			  }
	   }catch (SQLException e) {
		   success = false;
	}
	   return success;
   }

public boolean saveEduDetails(User user) {
	Connection con = DatabaseConnection.getConnectivity();
	String query="insert into edu_detail(userid,program,institute,duration,pyear,marks,cgpa) values(?,?,?,?,?,?,?)";
	int[] i=new int[0];
	boolean success=false;
	try
	{
		PreparedStatement ps=con.prepareStatement(query);
		for(EduDetail edu:user.getEduDetail()){
			ps.setString(1, edu.getUserid());
			ps.setString(2, edu.getProgram());
			ps.setString(3, edu.getInstitute());
			ps.setString(4, edu.getDuration());
			ps.setString(5, edu.getPyear());
			ps.setDouble(6,edu.getMarks());
			ps.setString(7,edu.getCgpa());
			
			ps.addBatch();
		}
        i=ps.executeBatch(); 
        if(i.length>0){
        	success=true;
        }
	}
	catch(SQLException ex)
	{
		success=false;
	}
	
	
	
	return success;
}

public boolean SaveQualificationform4(User user) {
	Connection con  = DatabaseConnection.getConnectivity();
	boolean s1 = certificationVal(con,user);
	boolean s2 = foiVal(con,user);
	boolean success = s1&&s2?true:false;
	return success;
}

public boolean certificationVal(Connection con, User user) {
	String query="INSERT INTO cirtification(userid,foc,Duration) VALUES(?,?,?)";
	boolean success =false;
	int[] i=new int[0];
	try {
		PreparedStatement ps=con.prepareStatement(query);
		for(Certification cert:user.getCirtifications()){
			ps.setString(1, cert.getUserid());
			ps.setString(2,cert.getFoc());
			ps.setString(3,cert.getDuration());
			ps.addBatch();
		}
	/*	*/
		i=ps.executeBatch();
		if(i.length>0){
			success=true;
		}
	} catch (SQLException e) {
		success=false;
	}
	return success;
}


public boolean foiVal(Connection con, User user) {
	String query="INSERT INTO foi(userid,foi1,foi2,foi3,foi4) VALUES(?,?,?,?,?)";
	boolean success=false;
	int i = 0;
	try{
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, user.getFieldOfInterest().getUserId());
		ps.setString(2, user.getFieldOfInterest().getfOInterest1());
		ps.setString(3, user.getFieldOfInterest().getfOInterest2());
		ps.setString(4, user.getFieldOfInterest().getfOInterest3());
		ps.setString(5, user.getFieldOfInterest().getfOInterest4());
		i = ps.executeUpdate();
		if(i>0){
			success = true;
		}
	}catch (SQLException e) {
		success = false;
	}
//   int[] i=new int[0];
//   try {
//	PreparedStatement ps=con.prepareStatement(query);
//		ps.setString(1,fil.getUserId());
//		ps.setString(2,fil.getfOInterest1());
//		ps.setString(3,fil.getfOInterest2());
//		ps.setString(4,fil.getfOInterest3());
//		ps.setString(5,fil.getfOInterest4());
//		ps.addBatch();
//	}
//	
//	i=ps.executeBatch();
//	if(i.length>0){
//		success=true;
//	}
//} catch (SQLException e) {
//	success=false;
//}
	return success;
}
}