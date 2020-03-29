package com.example.bestonealpha;
import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
	//declare variables
	private static String email;
	private String password;
	private  static String displayName;
	private ArrayList<Feedback> feedbackList;
	private static int feedbackCount;
	private double userScore;
	private ArrayList<StudyGroup> studyGroupList;

	// no argument constructor
	public User() {
		setEmail("no email set");
		setPassword("no password");
		setDisplayName("display name not set");
		setUserScore(0);
		setFeedbackCount(getFeedbackList().size());
		
	}

	//Register Constructor (takes display name)
	public User(String emailIn, String passwordIn, String displayNameIn) {
		this.setEmail(emailIn);
		this.setPassword(passwordIn);
		this.setDisplayName(displayNameIn);
		setUserScore(0);
		setFeedbackCount(0);
		feedbackList = new ArrayList<Feedback>();
		studyGroupList = new ArrayList<StudyGroup>();
	}

	//Login Constructor (doesn't take display name)
	public User(String emailIn, String passwordIn) {
		this.setEmail(emailIn);
		this.setPassword(passwordIn);
		this.setDisplayName(emailIn);
		setUserScore(0);
		setFeedbackCount(0);
		feedbackList = new ArrayList<Feedback>();
		studyGroupList = new ArrayList<StudyGroup>();
	}


	
	/**
	 * A method to create a study group.
	 */
	public void createStudyGroup(String groupName, String moduleCode, String details, String nextSession) {
		StudyGroup studyGroup = new StudyGroup(groupName, moduleCode, details, nextSession, this);
		this.getStudyGroupList().add(studyGroup);
	}
	
	
	/**
	 * A method which calculates the User's overall feedback score.
	 */
	public double calculateScore() {
		double tempScore = 0;
	for (Feedback feedback : feedbackList) {
		tempScore = feedback.getScore() + tempScore;
	}
	tempScore = tempScore/getFeedbackList().size();
	return tempScore;
	}
	
	/**
	 * A method to create feedback and give it to a target user.
	 * 
	 */
	public void createFeedback(User target, int score, String details) {
		Feedback feedback = new Feedback(this.getDisplayName(),  score,  details);
		giveFeedback(target, feedback);
	}

	/**
	 * A method which adds this users feedback to another user & their profile.
	 */
	public void giveFeedback(User target, Feedback feedback) {
		target.getFeedbackList().add(feedback);
	}

	/**
	 * A method which prints all user feedback about this user.
	 */
	public void printFeedback() {
		for (Feedback feedback:getFeedbackList()) {
			System.out.println("Score: "+ feedback.getScore());
			System.out.println("Left by: "+ feedback.getLeftBy());
			System.out.println("Comments: "+ feedback.getDetails());
			System.out.println("-----");
		}
		System.out.println("Total average score for " + this.getDisplayName() + ": " + this.getUserScore());
	}
	
	/**
	 * A method which prints study groups of which this user is a member.
	 */
	public void printStudyGroups() {
		for (StudyGroup studyGroup:getStudyGroupList()) {
			System.out.println("Group Name: "+ studyGroup.getGroupName());
			System.out.println("Leader Name: "+ studyGroup.getLeaderName());
			System.out.println("Leader Email: "+ studyGroup.getLeader().getEmail());
			System.out.println("-----");
		}
	}
	
	/**
	 * @return the email
	 */
	public static String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the displayName
	 */
	public static String getDisplayName() {
		return displayName;
	}
	/**
	 * @param displayName the displayName to set
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return the feedbackCount
	 */
	public static int getFeedbackCount() {
		return feedbackCount;
	}

	/**
	 * @param feedbackCount the feedbackCount to set
	 */
	public void setFeedbackCount(int feedbackCount) {
		this.feedbackCount = feedbackCount;
	}

	/**
	 * @return the feedbackList
	 */
	public ArrayList<Feedback> getFeedbackList() {
		return feedbackList;
	}

	/**
	 * @param feedbackList the feedbackList to set
	 */
	public void setFeedbackList(ArrayList<Feedback> feedbackList) {
		this.feedbackList = feedbackList;
	}

	/**
	 * @return the userScore
	 */
	public double getUserScore() {
		setUserScore(calculateScore());
		return userScore;
	}

	/**
	 * @param userScore the userScore to set
	 */
	public void setUserScore(double userScore) {
		this.userScore = userScore;
	}

	/**
	 * @return the studyGroupList
	 */
	public ArrayList<StudyGroup> getStudyGroupList() {
		return studyGroupList;
	}

	/**
	 * @param studyGroupList the studyGroupList to set
	 */
	public void setStudyGroupList(ArrayList<StudyGroup> studyGroupList) {
		this.studyGroupList = studyGroupList;
	}


}
