package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Movie;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.TextView;

public class searchActivity extends AppCompatActivity {

    public searchActivity(User userIn) {
        // deliberately blank
    }


    //Declare views
    TextView userName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Using getSerializableExtra(String key) method
        User currentUser = (User) getIntent().getSerializableExtra("user");

        super.onCreate(savedInstanceState);
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.AppDarkTheme);
        } else {
            setTheme(R.style.AppLightTheme);
        }

        userName = findViewById(R.id.userNamesrch);
        userName.setText(currentUser.getDisplayName());




        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_search);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
