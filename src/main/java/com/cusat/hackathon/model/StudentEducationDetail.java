package com.cusat.hackathon.model;

public class StudentEducationDetail {
	private String userId;
	private String categoryId;
	private String qlfAttrId;
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
	 * @return the categoryId
	 */
	public String getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	/**
	 * @return the qlfAttrId
	 */
	public String getQlfAttrId() {
		return qlfAttrId;
	}
	/**
	 * @param qlfAttrId the qlfAttrId to set
	 */
	public void setQlfAttrId(String qlfAttrId) {
		this.qlfAttrId = qlfAttrId;
	}
}
