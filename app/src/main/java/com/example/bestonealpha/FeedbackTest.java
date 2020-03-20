package com.example.bestonealpha;

public class FeedbackTest {
	public static void main(String[] args) {
		User me = new User("jb@email.com", "somepassword", "Jonathan B");
		User a = new User("annie@amail.com", "somepassword2", "Annie K");
		User b = new User("bob@bmail.com", "somepassword3", "Bob P");
		User c = new User("charlie@cmail.com", "somepassword4", "Charlie G");
		StudyGroup sg = new StudyGroup("Physics Revision", "PH248", "Every wednesday at 3 in the library!", "Wed 25th March", me);
		
		sg.addToMemberList(a);
		sg.addToMemberList(b);
		sg.addToMemberList(c);
		
		c.createFeedback(me, 5, "great");
		b.createFeedback(me, 4, "good");
		a.createFeedback(me, 3, "alright");
		
		me.printFeedback();
		sg.printStudyGroupDetails();
		
		
	}
}