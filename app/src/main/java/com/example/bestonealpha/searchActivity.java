package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< Updated upstream
=======
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
>>>>>>> Stashed changes
import android.widget.ListView;

import com.example.bestonealpha.data.GroupListAdapter;

import java.util.ArrayList;

public class searchActivity extends AppCompatActivity {

<<<<<<< Updated upstream
=======
    //Declare views
    Button createButton;
    Button profile;

    // Declare and initialise variables
    ArrayList<StudyGroup> masterGroupList = new ArrayList<>();

    public ArrayList<StudyGroup> getMasterGroupList() {
        return masterGroupList;
    }
>>>>>>> Stashed changes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ListView list = (ListView) findViewById(R.id.searchListView);

<<<<<<< Updated upstream
        // Declare and initialise variables
        ArrayList<StudyGroup> masterGroupList = new ArrayList<>();
=======
        // Initialise button
        createButton = findViewById(R.id.searchCreateGroupBtn);
        profile = findViewById(R.id.button3);
>>>>>>> Stashed changes

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


<<<<<<< Updated upstream
=======
        //Create Group Button
        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent groupCreated = new Intent(getApplicationContext(), createStudyOpp.class);
                startActivity(groupCreated);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View v) {
                Intent viewProfile = new Intent(getApplicationContext(), profileActivity.class);
                startActivity(viewProfile);
            }
        });


>>>>>>> Stashed changes
    }
}
