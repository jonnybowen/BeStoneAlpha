package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TutorActivity extends AppCompatActivity {

    Button applyTut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.AppDarkTheme);
        } else {
            setTheme(R.style.AppLightTheme);
        }
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_apply_tutor);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       Button applyTut = findViewById(R.id.applyToBeTut);
        applyTut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent applyToTutor = new Intent(getApplicationContext(), tutorConfirm.class);
                startActivity(applyToTutor);
            }
        });
    }
}
