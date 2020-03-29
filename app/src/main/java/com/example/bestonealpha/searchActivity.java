package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.bestonealpha.data.GroupListAdapter;

import java.util.ArrayList;

public class searchActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ListView list = (ListView) findViewById(R.id.searchListView);

        // Declare and initialise variables
        ArrayList<StudyGroup> masterGroupList = new ArrayList<>();

        // Create Users and Study Groups to populate group list
        User a = new User("annie@amail.com", "somepassword2", "Annie K");
        User b = new User("bob@bmail.com", "somepassword3", "Bob P");
        User c = new User("charlie@cmail.com", "somepassword4", "Charlie G");
        User d = new User("jb@email.com", "somepassword", "Jonathan B");
        StudyGroup sg1 = new StudyGroup("Physics Revision", "PH248", "Every wednesday at 3 in the library!", "Wed 25th March", a);
        StudyGroup sg2 = new StudyGroup("Java Revision", "CS991", "Bring your laptop", "Friday 3rd April", b);
        StudyGroup sg3 = new StudyGroup("Essay Help", "EL833", "Weekend revision group for english lit!", "Saturday 14th March", c);
        StudyGroup sg4 = new StudyGroup("Applied Maths (PAID)", "MM983", "Paid maths Tutoring", "At your request", d);
        masterGroupList.add(sg1);
        masterGroupList.add(sg2);
        masterGroupList.add(sg3);
        masterGroupList.add(sg4);

        GroupListAdapter adapter = new GroupListAdapter(this, R.layout.group_adapter_view, masterGroupList);
        list.setAdapter(adapter);


    }
}
