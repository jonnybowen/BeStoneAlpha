import java.util.ArrayList;

public class StudyGroup {
	//initialise variables
private String groupName;
private String moduleCode;
private String details;
private String nextSession;
private User leader;
private String leaderName;
private ArrayList<User> memberList = new ArrayList<>();
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

public StudyGroup(String groupName, String moduleCode, String details, String nextSession, User leader) {
	this.setGroupName(groupName);
	this.setModuleCode(moduleCode);
	this.setDetails(details);
	this.setNextSession(nextSession);
	this.setLeader(leader);
	this.setLeaderName(leader.getDisplayName());
	this.setGroupOpen(true);
	this.addToMemberList(leader);
}

/**
 * @return the groupName
 */
public String getGroupName() {
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
public String getModuleCode() {
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
 * @return the dateTime
 */
public String getNextSession() {
	return nextSession;
}
/**
 * @param dateTime the dateTime to set
 */
public void setNextSession(String nextSession) {
	this.nextSession = nextSession;
}

/**
 * @return the leader
 */
public User getLeader() {
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
public String getLeaderName() {
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
public ArrayList<User> getMemberList() {
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
 * @param groupOpen the groupOpen to set
 */
public void setGroupOpen(boolean truefalse) {
	this.groupOpen = truefalse;
}

}
