
public class FeedbackTest {
	public static void main(String[] args) {
		User me = new User("jb@email.com", "somepassword", "Jonathan B");
		User a = new User("annie@amail.com", "somepassword2", "Annie K");
		User b = new User("bob@bmail.com", "somepassword3", "Bob P");
		User c = new User("charlie@cmail.com", "somepassword4", "Charlie G");
		
		c.createFeedback(me, 5, "great");
		b.createFeedback(me, 4, "good");
		a.createFeedback(me, 3, "alright");
		
		me.printFeedback();
		
		me.createStudyGroup("Physics Revision", "", "we study all levels of physics", "2020-03-15");
		
	me.printStudyGroups();
	me.inviteUser(c, ); // fix this. is studygroup independent object?
	}
}