package com.cusat.hackathon.model;

import com.sun.jmx.snmp.Timestamp;

public class Result {
     private String userId;
     private int score;
     private int scoreFoi1;
     private int scoreFoi2;
     private int scoreFoi3;
     private int scoreFoi4;
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
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	public int getScoreFoi1() {
		return scoreFoi1;
	}
	/**
	 * @param scoreFoi1 the scoreFoi1 to set
	 */
	public void setScoreFoi1(int scoreFoi1) {
		this.scoreFoi1 = scoreFoi1;
	}
	/**
	 * @return the scoreFoi2
	 */
	public int getScoreFoi2() {
		return scoreFoi2;
	}
	/**
	 * @param scoreFoi2 the scoreFoi2 to set
	 */
	public void setScoreFoi2(int scoreFoi2) {
		this.scoreFoi2 = scoreFoi2;
	}
	/**
	 * @return the scoreFoi3
	 */
	public int getScoreFoi3() {
		return scoreFoi3;
	}
	/**
	 * @param scoreFoi3 the scoreFoi3 to set
	 */
	public void setScoreFoi3(int scoreFoi3) {
		this.scoreFoi3 = scoreFoi3;
	}
	/**
	 * @return the scoreFoi4
	 */
	public int getScoreFoi4() {
		return scoreFoi4;
	}
	/**
	 * @param scoreFoi4 the scoreFoi4 to set
	 */
	public void setScoreFoi4(int scoreFoi4) {
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