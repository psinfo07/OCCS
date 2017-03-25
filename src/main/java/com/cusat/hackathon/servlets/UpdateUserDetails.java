package com.cusat.hackathon.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cusat.hackathon.model.CorrespondenceAddress;
import com.cusat.hackathon.model.PermanentAddress;
import com.cusat.hackathon.model.PersonalDetail;
import com.cusat.hackathon.model.User;
import com.cusat.hackathon.services.UserService;
import com.cusat.hackathon.services.UserServiceImpl;

/**
 * Servlet implementation class UpdateUserDetails
 */
public class UpdateUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(true);
		User currentUser=(User) session.getAttribute("user");
		String email=currentUser.getPersonalDetail().getEmailId();
		User user =new User();
		
		String name = request.getParameter("name");
		String fatherName = request.getParameter("fName");
		String motherName = request.getParameter("mName");
		String mobile = request.getParameter("mobile");
		String p_addressline1=request.getParameter("add1");
		String p_addressline2 = request.getParameter("add2");
		String p_city = request.getParameter("city");
		String p_dist = request.getParameter("district");
		String p_state = request.getParameter("state");
		String p_pin = request.getParameter("pin");
		
		//c_address
		String c_addressline1=request.getParameter("add1");
		String c_addressline2 = request.getParameter("add2");
		String c_city = request.getParameter("city");
		String c_dist = request.getParameter("district");
		String c_state = request.getParameter("state");
		String c_pin = request.getParameter("pin");
		
		PersonalDetail pd = new PersonalDetail();
		pd.setEmailId(email); 
		pd.setName(name);
		pd.setFatherName(fatherName);
		pd.setMotherName(motherName);
		pd.setMobileNo(mobile);
		user.setPersonalDetail(pd);
		
		PermanentAddress pa = new PermanentAddress();
		pa.setAddressLine1(p_addressline1);
		pa.setAddressLine2(p_addressline2);
		pa.setCity(p_city);
		pa.setDist(p_dist);
		pa.setState(p_state);
		pa.setPin(p_pin);
		pa.setUserId(email);
		user.setPermanentAddress(pa);
		
		CorrespondenceAddress ca = new CorrespondenceAddress();
		ca.setAddressLine1(c_addressline1);
		ca.setAddressLine2(c_addressline2);
		ca.setCity(c_city);
		ca.setDist(c_dist);
		ca.setState(c_state);
		ca.setPin(c_pin);
		ca.setUserId(email);
		user.setCorrespondenceAddress(ca);
		
		UserService userService= new UserServiceImpl();
		boolean flag=userService.updateUserDetails(user);
		if(flag){
			request.setAttribute("key", "Details Updated successfully"); 
			request.getRequestDispatcher("login_home.jsp").forward(request, response);
		}
		
		
		
		
	}

}
