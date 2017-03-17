package com.cusat.hackathon.model;

import com.sun.jmx.snmp.Timestamp;

public class LogDetails {
	private String userId;
	private Timestamp lastLogIn;
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the lastLogIn
	 */
	public Timestamp getLastLogIn() {
		return lastLogIn;
	}
	/**
	 * @param lastLogIn the lastLogIn to set
	 */
	public void setLastLogIn(Timestamp lastLogIn) {
		this.lastLogIn = lastLogIn;
	}
	
}
