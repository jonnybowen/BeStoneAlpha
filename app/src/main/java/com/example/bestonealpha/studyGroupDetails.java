package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class studyGroupDetails extends AppCompatActivity {

    //initialise variables
    static String name = StudyGroup.getGroupName();
    String module = StudyGroup.getModuleCode();
    String details = StudyGroup.getDetails();
    String nextSession = StudyGroup.getNextSession();
    User leader = StudyGroup.getLeader();
    ArrayList memberList = StudyGroup.getMemberList();

    //initialise views
    private TextView nameStudyGroupDetails;
    private TextView groupLeaderUsername;
    private RatingBar hostRating;
    private TextView subjectBar;
    private TextView dateTime;
    private TextView summaryOfStudy;
    private TextView attendees;
    private Button attendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_group_details2);


        nameStudyGroupDetails = findViewById(R.id.nameStudyGroupDetails);
        groupLeaderUsername = findViewById(R.id.groupLeaderUsername);
        hostRating = findViewById(R.id.hostRating);
        subjectBar = findViewById(R.id.subjectBar);
        dateTime = findViewById(R.id.dateTime);
        summaryOfStudy = findViewById(R.id.summaryOfStudy);
        attendees = findViewById(R.id.attendees);
        attendButton = findViewById(R.id.attendButton);

        nameStudyGroupDetails.setText(name);
        subjectBar.setText(module);
        summaryOfStudy.setText(details);
        dateTime.setText(nextSession);
        groupLeaderUsername.setText(leader.getDisplayName());
        attendees.setText(memberList.toString());

        attendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User attendingUser = MainActivity.getUser();
                memberList.add(attendingUser);
            }
        });
    }
}
