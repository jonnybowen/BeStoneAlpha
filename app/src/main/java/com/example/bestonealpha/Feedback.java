package com.example.bestonealpha;

public class Feedback {
	// declare variables
	private String leftBy;
	private int score;
	private String details;
	
	//constructor
	public Feedback(String user, int score, String details) {
		setLeftBy(user);
		setScore(score);
		setDetails(details);
	}
	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
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
	/**
	 * @return the leftBy
	 */
	public String getLeftBy() {
		return leftBy;
	}
	/**
	 * @param leftBy the leftBy to set
	 */
	public void setLeftBy(String leftBy) {
		this.leftBy = leftBy;
	}
}
