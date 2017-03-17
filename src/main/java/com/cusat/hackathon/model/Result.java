package com.cusat.hackathon.model;

import com.sun.jmx.snmp.Timestamp;

public class Result {
     private String userId;
     private String score;
     private String scoreFoi1;
     private String scoreFoi2;
     private String scoreFoi3;
     private String scoreFoi4;
     private Timestamp lastUpdatets;
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
	 * @return the score
	 */
	public String getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(String score) {
		this.score = score;
	}
	/**
	 * @return the scoreFoi1
	 */
	public String getScoreFoi1() {
		return scoreFoi1;
	}
	/**
	 * @param scoreFoi1 the scoreFoi1 to set
	 */
	public void setScoreFoi1(String scoreFoi1) {
		this.scoreFoi1 = scoreFoi1;
	}
	/**
	 * @return the scoreFoi2
	 */
	public String getScoreFoi2() {
		return scoreFoi2;
	}
	/**
	 * @param scoreFoi2 the scoreFoi2 to set
	 */
	public void setScoreFoi2(String scoreFoi2) {
		this.scoreFoi2 = scoreFoi2;
	}
	/**
	 * @return the scoreFoi3
	 */
	public String getScoreFoi3() {
		return scoreFoi3;
	}
	/**
	 * @param scoreFoi3 the scoreFoi3 to set
	 */
	public void setScoreFoi3(String scoreFoi3) {
		this.scoreFoi3 = scoreFoi3;
	}
	/**
	 * @return the scoreFoi4
	 */
	public String getScoreFoi4() {
		return scoreFoi4;
	}
	/**
	 * @param scoreFoi4 the scoreFoi4 to set
	 */
	public void setScoreFoi4(String scoreFoi4) {
		this.scoreFoi4 = scoreFoi4;
	}
	/**
	 * @return the lastUpdatets
	 */
	public Timestamp getLastUpdatets() {
		return lastUpdatets;
	}
	/**
	 * @param lastUpdatets the lastUpdatets to set
	 */
	public void setLastUpdatets(Timestamp lastUpdatets) {
		this.lastUpdatets = lastUpdatets;
	}
}
