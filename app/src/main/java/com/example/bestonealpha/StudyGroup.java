package com.example.bestonealpha;

import java.util.ArrayList;

public class StudyGroup {
	//initialise variables
	private static String groupName;
	private static String moduleCode;
	private static String details;
	private static String nextSession;
	private static User leader;
	private static String leaderName;
	private static ArrayList<User> memberList = new ArrayList<>();
	private boolean groupOpen;

	// no argument constructor 
	public StudyGroup() {
		groupName = "group name not set";
		moduleCode = "code not set";
		details = "no details given";
		nextSession = "no date/time set";
		leaderName = leader.getDisplayName();
		groupOpen = true;
		addToMemberList(leader);
	}

	//ListView Constructor
	public StudyGroup(String groupName, String leaderName, String nextSession) {
		this.setGroupName(groupName);
		this.setNextSession(nextSession);
		this.setLeaderName(leaderName);
	}

	public StudyGroup(String groupName, String moduleCode, String details, String nextSession, User leader) {
		this.setGroupName(groupName);
		this.setModuleCode(moduleCode);
		this.setDetails(details);
		this.setNextSession(nextSession);
		this.setLeader(leader);
		this.setLeaderName(leader.getDisplayName());
		this.setGroupOpen(true);
		this.addToMemberList(leader);
		leader.getStudyGroupList().add(this);
	}

	/**
	 * A method to invite another user to a study group
	 */
	public void inviteUser(User user) {
		this.addToMemberList(user);
	}

	public void printStudyGroupDetails() {
		System.out.println("Member List for " + this.getGroupName());
		System.out.println("Leader: "+ this.getLeaderName());
		System.out.println("Number of members: " + this.memberList.size());

		for (User user: getMemberList()) {
			if (user == this.getLeader()) {
				// intentionally blank
			} else {
				System.out.println("Member: " + user.getDisplayName());
			}
		}
	}


	/**
	 * @return the groupName
	 */
	public static String getGroupName() {
		return groupName;
	}
	/**
	 * @param groupName the groupName to set
	 */
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	/**
	 * @return the moduleCode
	 */
	public static String getModuleCode() {
		return moduleCode;
	}
	/**
	 * @param moduleCode the moduleCode to set
	 */
	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	/**
	 * @return the details
	 */
	public static String getDetails() {
		return details;
	}
	/**
	 * @param details the details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}
	/**
	 * @return the dateTime
	 */
	public static String getNextSession() {
		return nextSession;
	}
	/**
	 * @param nextSession the next session to set
	 */
	public void setNextSession(String nextSession) {
		this.nextSession = nextSession;
	}

	/**
	 * @return the leader
	 */
	public static User getLeader() {
		return leader;
	}

	/**
	 * @param leader the leader to set
	 */
	public void setLeader(User leader) {
		this.leader = leader;
	}

	/**
	 * @return the leaderName
	 */
	public static String getLeaderName() {
		return leaderName;
	}

	/**
	 * @param leaderName the leaderName to set
	 */
	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	/**
	 * @return the memberList
	 */
	public static ArrayList<User> getMemberList() {
		return memberList;
	}

	/**
	 * Add a user to the group
	 * @param user the user to add
	 */
	public void addToMemberList(User user) {
		getMemberList().add(user);
	}

	/**
	 * @return the groupOpen
	 */
	public boolean isGroupOpen() {
		return groupOpen;
	}

	/**
	 * @param truefalse whether the group is open or not
	 */
	public void setGroupOpen(boolean truefalse) {
		this.groupOpen = truefalse;
	}

}
