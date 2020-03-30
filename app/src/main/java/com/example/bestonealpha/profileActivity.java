package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class profileActivity extends AppCompatActivity {

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
        //button to create a study session
        Button createStudyOppButton = findViewById(R.id.StudyOppButton);
        createStudyOppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createStudyOppScreen = new Intent(getApplicationContext(), createStudyOpp.class);
                startActivity(createStudyOppScreen);
            }
        });
        //button to apply to become a tutor
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

