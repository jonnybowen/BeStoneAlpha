package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class searchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.AppDarkTheme);
        } else {
            setTheme(R.style.AppLightTheme);
        }
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_search);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton profileImageButton = findViewById(R.id.searchProfilePicture);
        profileImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchProfilePicture = new Intent(getApplicationContext(), profileActivity.class);
                startActivity(searchProfilePicture);

            }
        });
    }
}