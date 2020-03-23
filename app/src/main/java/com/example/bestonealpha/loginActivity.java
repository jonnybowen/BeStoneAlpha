package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatDelegate;

public class loginActivity extends AppCompatActivity {

    // Declare variable
    String emailString;
    String passwordString;

    // Declare views/editTexts/Buttons
    EditText email;
    EditText password;
    Button register;
    Button login;

    public String getEmailString() {
        return emailString;
    }

    public void setEmailString(String emailIn) {
        emailString = emailIn;
    }

    public String getPasswordString() {
        return passwordString;
    }

    public void setPasswordString(String passIn) {
        passwordString = passIn;
    }



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
        email = (EditText)findViewById(R.id.EmailEditLogin);
        password = (EditText)findViewById(R.id.passwordEditLogin);
        register = (Button)findViewById(R.id.loginRegisterButton);
        login = (Button)findViewById(R.id.submitLoginButton)
;
      //  setContentView(R.layout.activity_main); - seems useless, can we delete?
        setContentView(R.layout.activity_login);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //Submit Login Button
        login = findViewById(R.id.submitLoginButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Initialise Strings
                emailString = email.getText().toString();
                passwordString = password.getText().toString();

                //Create User
                User currentUser = new User(emailString, passwordString);

                Intent searchScreen = new Intent(getApplicationContext(), searchActivity.class);
                searchScreen.putExtra("user", currentUser);
                startActivity(searchScreen);
            }
        });

       // Register Button
   //     register.setOnClickListener(new View.OnClickListener() {
   //         @Override
   //         public void onClick(View v) {
  //              Intent registerScreen = new Intent(getApplicationContext(), registerActivity.class);
  //              startActivity(registerScreen);
   //         }
  //      });

    }
}
