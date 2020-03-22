package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;

public class createStudyOpp extends AppCompatActivity {

    // initialise views/editTexts
    EditText groupName;
    EditText moduleCode;
    EditText details;
    EditText nextSession;
    Button SGsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.AppDarkTheme);
        } else {
            setTheme(R.style.AppLightTheme);
        }

        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_create_study_opp);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // add back button

        // initialise views
        groupName = findViewById(R.id.oppType);
        moduleCode = findViewById(R.id.addClassCode);
        details = findViewById(R.id.addDetail);
        nextSession = findViewById(R.id.addDate);
        SGsubmit = findViewById(R.id.submit);

        /*
        The Randomise button. Clicking it will call the function that generates a random array of
        numbers.
         */
        SGsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User u = new User(); // dummy user - until we integrate users this is the only way to make the group
                StudyGroup sg = new StudyGroup(groupName.toString(), moduleCode.toString(), details.toString(), nextSession.toString(), u);
            }
        });



    }
}
