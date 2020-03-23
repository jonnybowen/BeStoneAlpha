package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class loginActivity extends AppCompatActivity {



    // Declare views/editTexts/Buttons
    EditText email;
    EditText password;
    Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        // Dark Mode Code
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.AppDarkTheme);
        } else {
            setTheme(R.style.AppLightTheme);
        }

        //Initialise buttons/views
        email = findViewById(R.id.emailEdit);
        password = findViewById(R.id.passwordEdit);
        register = findViewById(R.id.loginRegisterButton);

        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button submitLoginButton = findViewById(R.id.submitLoginButton);
        submitLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Create User
                User currentUser = new User(email.toString(), password.toString());

                Intent searchScreen = new Intent(getApplicationContext(), searchActivity.class);
                searchScreen.putExtra("user", currentUser);
                startActivity(searchScreen);
            }
        });

       // Register Button
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerScreen = new Intent(getApplicationContext(), registerActivity.class);
                startActivity(registerScreen);
            }
        });

    }
}
