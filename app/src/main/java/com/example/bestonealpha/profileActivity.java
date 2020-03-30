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

        Button appTut;
        TextView username;
        TextView email;
        TextView rating;



        //String profileEmail = User.getEmail();
     //String profileDisplayName = User.getDisplayName();
     //int profileFeedbackCount = User.getFeedbackCount();

     //private TextView profileUsername;
     //private TextView profileEmailAddress;
     //private TextView profileRatingCount;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.AppDarkTheme);
        } else {
            setTheme(R.style.AppLightTheme);
        }
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        username = findViewById(R.id.profileUsername);
        email = findViewById(R.id.profileEmailAddress);
        rating = findViewById(R.id.profileRatingCount);
        appTut = findViewById(R.id.applyTutor);

       // profileUsername = findViewById(R.id.profileUsername);
       // profileEmailAddress = findViewById(R.id.profileEmailAddress);
       // profileRatingCount = findViewById(R.id.profileRatingCount);

       // profileUsername.setText(profileEmail);
       // profileEmailAddress.setText(profileDisplayName);
       // profileRatingCount.setText(profileFeedbackCount);

       // Button createStudyOppButton = findViewById(R.id.StudyOppButton);
       // createStudyOppButton.setOnClickListener(new View.OnClickListener() {
          //  @Override
          //  public void onClick(View v) {
              //  Intent createStudyOppScreen = new Intent(getApplicationContext(), createStudyOpp.class);
              //  startActivity(createStudyOppScreen);
        //    }
      //  });

       Button appTut = findViewById(R.id.applyTutor);
       appTut.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent Apptutor = new Intent(getApplicationContext(), TutorActivity.class);
               startActivity(Apptutor);
           }
        });


    }
}

