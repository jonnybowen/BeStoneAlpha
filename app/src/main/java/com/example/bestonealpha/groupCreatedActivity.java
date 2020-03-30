package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class groupCreatedActivity extends AppCompatActivity {

    String groupName;
    String moduleCode;
    String details;
    String nextSession;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_created);

        // Initialise views
        TextView groupNameView = findViewById(R.id.agc_groupName2);
        TextView moduleCodeView = findViewById(R.id.agc_moduleCode2);
        TextView detailsView = findViewById(R.id.agc_details2);
        TextView nextSessionView = findViewById(R.id.agc_nextSession2);


        Intent intent = getIntent();
         groupName   = intent.getStringExtra("group_name");
         moduleCode  = intent.getStringExtra("module_code");
         details     = intent.getStringExtra("details");
         nextSession = intent.getStringExtra("next_session");


        groupNameView.setText(groupName);
        moduleCodeView.setText(moduleCode);
        detailsView.setText(details);
        nextSessionView.setText(nextSession);

    }
}
