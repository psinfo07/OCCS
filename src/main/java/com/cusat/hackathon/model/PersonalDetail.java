package com.cusat.hackathon.model;

import com.sun.jmx.snmp.Timestamp;

public class PersonalDetail {
	private String name;
	private String fatherName;
	private String motherName;
	private String emailId;
	private String mobileNo;
	private String password;
	private Timestamp lastUpdateTs;
	private int valid;  
	private String hqualification;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFatherName() {
		return fatherName;
	}
	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	/**
	 * @return the motherName
	 */
	public String getMotherName() {
		return motherName;
	}
	/**
	 * @param motherName the motherName to set
	 */
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the mobileNo
	 */
	public String getMobileNo() {
		return mobileNo;
	}
	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the lastUpdateTs
	 */
	public Timestamp getLastUpdateTs() {
		return lastUpdateTs;
	}
	/**
	 * @param lastUpdateTs the lastUpdateTs to set
	 */
	public void setLastUpdateTs(Timestamp lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

	/**
	 * @return the valid
	 */
	public int isValid() {
		return valid;
	}

	/**
	 * @param valid the valid to set
	 */
	public void setValid(int valid) {
		this.valid = valid;
	}

	public String getHqualification() {
		return hqualification;
	}

	public void setHqualification(String hqualification) {
		this.hqualification = hqualification;
	}

}
