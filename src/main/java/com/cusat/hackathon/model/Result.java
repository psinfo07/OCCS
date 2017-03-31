package com.cusat.hackathon.model;

import com.sun.jmx.snmp.Timestamp;

public class Result {
     private String userId;
     private int score;
     private int scoreFoi1;
     private int scoreFoi2;
     private int scoreFoi3;
     private int scoreFoi4;
     private String sub1;
     private String sub2;
     private String sub3;
     private String sub4;
     private String collegeNames;
     /**
	 * @return the sub1
	 */
	public String getSub1() {
		return sub1;
	}
	/**
	 * @param sub1 the sub1 to set
	 */
	public void setSub1(String sub1) {
		this.sub1 = sub1;
	}
	/**
	 * @return the sub2
	 */
	public String getSub2() {
		return sub2;
	}
	/**
	 * @param sub2 the sub2 to set
	 */
	public void setSub2(String sub2) {
		this.sub2 = sub2;
	}
	/**
	 * @return the sub3
	 */
	public String getSub3() {
		return sub3;
	}
	/**
	 * @param sub3 the sub3 to set
	 */
	public void setSub3(String sub3) {
		this.sub3 = sub3;
	}
	/**
	 * @return the sub4
	 */
	public String getSub4() {
		return sub4;
	}
	/**
	 * @param sub4 the sub4 to set
	 */
	public void setSub4(String sub4) {
		this.sub4 = sub4;
	}
	
		
     /**
	 * @return the collegeNames
	 */
	public String getCollegeNames() {
		return collegeNames;
	}
	/**
	 * @param collegeNames the collegeNames to set
	 */
	public void setCollegeNames(String collegeNames) {
		this.collegeNames = collegeNames;
	}
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