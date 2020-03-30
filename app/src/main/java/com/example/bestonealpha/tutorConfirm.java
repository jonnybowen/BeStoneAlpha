package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.widget.TextView;

public class tutorConfirm extends AppCompatActivity {

    TextView applyNotf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.AppDarkTheme);
        } else {
            setTheme(R.style.AppLightTheme);
        }
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_tutor_confirm);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        applyNotf = findViewById(R.id.textView3);
    }
}
