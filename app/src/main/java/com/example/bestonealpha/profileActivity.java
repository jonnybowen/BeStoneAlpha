package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class profileActivity extends AppCompatActivity {

     String profileEmail = User.getEmail();
     String profileDisplayName = User.getDisplayName();
     int profileFeedbackCount = User.getFeedbackCount();

     private TextView profileUsername;
     private TextView profileEmailAddress;
     private TextView profileRatingCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.AppDarkTheme);
        } else {
            setTheme(R.style.AppLightTheme);
        }

        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        profileUsername = findViewById(R.id.profileUsername);
        profileEmailAddress = findViewById(R.id.profileEmailAddress);
        profileRatingCount = findViewById(R.id.profileRatingCount);

        profileUsername.setText(profileEmail);
        profileEmailAddress.setText(profileDisplayName);
        profileRatingCount.setText(profileFeedbackCount);

        Button createStudyOppButton = findViewById(R.id.StudyOppButton);
        createStudyOppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createStudyOppScreen = new Intent(getApplicationContext(), createStudyOpp.class);
                startActivity(createStudyOppScreen);
            }
        });

        Button applyTutor = findViewById(R.id.applyTutor);
        applyTutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tutor = new Intent(getApplicationContext(), TutorActivity.class);
                startActivity(tutor);
            }
        });


    }
}

