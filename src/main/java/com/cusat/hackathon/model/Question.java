package com.cusat.hackathon.model;

public class Question {
	private String sectorCode;
	private String question;
	
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String answer;
	
	public String getSectorCode() {
		return sectorCode;
	}
	/**
	 * @param sectorCode the sectorCode to set
	 */
	public void setSectorCode(String sectorCode) {
		this.sectorCode = sectorCode;
	}
	/**
	 * @return the option1
	 */
	public String getOption1() {
		return option1;
	}
	/**
	 * @param option1 the option1 to set
	 */
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	/**
	 * @return the option2
	 */
	public String getOption2() {
		return option2;
	}
	/**
	 * @param option2 the option2 to set
	 */
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	/**
	 * @return the option3
	 */
	public String getOption3() {
		return option3;
	}
	/**
	 * @param option3 the option3 to set
	 */
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	/**
	 * @return the option4
	 */
	public String getOption4() {
		return option4;
	}
	/**
	 * @param option4 the option4 to set
	 */
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}
	/**
	 * @param answer the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	
}
