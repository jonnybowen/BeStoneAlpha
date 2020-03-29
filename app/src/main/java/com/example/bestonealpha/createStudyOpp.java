package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;

public class createStudyOpp extends AppCompatActivity {

    // declare views/editTexts
    EditText groupName;
    EditText moduleCode;
    EditText details;
    EditText nextSession;
    Button SGsubmit;

    //declare variables to pass
    String passGroupName;
    String passModuleCode;
    String passDetails;
    String passNextSession;

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
                  passGroupName = groupName.getText().toString();
                  passModuleCode = moduleCode.getText().toString();
                  passDetails = details.getText().toString();
                  passNextSession = nextSession.getText().toString();

                Intent groupCreated = new Intent(getApplicationContext(), searchActivity.class);
                groupCreated.putExtra("group_name", passGroupName);
                groupCreated.putExtra("module_code", passModuleCode);
                groupCreated.putExtra("details", passDetails);
                groupCreated.putExtra("next_session", passNextSession);

                startActivity(groupCreated);
            }
        });



    }
}
