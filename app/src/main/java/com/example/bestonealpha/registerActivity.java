package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registerActivity extends AppCompatActivity {

    // Declare views and edittexts
    EditText email;
    EditText userName;
    EditText password;
    EditText confirmPassword;
    Button registerBtn;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.AppDarkTheme);
        } else {
            setTheme(R.style.AppLightTheme);
        }

        email = findViewById(R.id.EmailEditReg);
        userName = findViewById(R.id.userNameEditReg);
        password = findViewById(R.id.passwordEditReg);
        confirmPassword = findViewById(R.id.confirmpassEditReg);
        registerBtn = findViewById(R.id.completeRegisterButton);


        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User registerUser = new User(email.getText().toString(), password.getText().toString(), userName.getText().toString());
                Intent searchScreen = new Intent(getApplicationContext(), searchActivity.class);
                startActivity(searchScreen);
            }
        });
    }
}
