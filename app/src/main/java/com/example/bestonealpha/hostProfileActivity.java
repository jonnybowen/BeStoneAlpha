package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class hostProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host_profile);

        final Button giveFeedbackButton = (Button) findViewById(R.id.giveFeedbackButton);
        //button to give the tutor feedback
        giveFeedbackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToFeedback = new Intent(getApplicationContext(), leaveFeedback.class);
                startActivity(goToFeedback);
            }
        });
    }
}
