package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

public class leaveFeedback extends AppCompatActivity {

    String userFeedback;
    int userRating;

    User user = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.AppDarkTheme);
        } else {
            setTheme(R.style.AppLightTheme);
        }

        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_leave_feedback);

        Button feedbackButton = (Button) findViewById(R.id.feedbackButton);
        final EditText feedbackText = (EditText) findViewById(R.id.feedbackText);
        final RatingBar rating = (RatingBar) findViewById(R.id.ratingBar);

       //button to confirm feedback and ensure feedback is saved
        feedbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userFeedback = feedbackText.getText().toString();
                userRating = rating.getNumStars();

                user.createFeedback(user, userRating, userFeedback);

                Intent backToProfile = new Intent(getApplicationContext(), searchActivity.class);
                startActivity(backToProfile);
            }
        });
    }
}
