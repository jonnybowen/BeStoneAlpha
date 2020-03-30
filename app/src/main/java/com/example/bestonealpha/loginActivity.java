package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatDelegate;

public class loginActivity extends AppCompatActivity {



    // Declare variable
    String emailString;
    String passwordString;
    String username;
    String userPassword;



    // Declare views/editTexts/Buttons/TextViews
    EditText email;
    EditText password;
    Button register;
    Button login;
    TextView loginFail;

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
    // method for checking the email field to ensure it is correct
    public boolean emailCheck() {
        EditText emailReg = (EditText) findViewById(R.id.emailEditReg);
        TextView emailError = (TextView) findViewById(R.id.emailError);
        TextView emptyCheck = (TextView) findViewById(R.id.emptyFieldError);
        if (!emailReg.getText().toString().contains("@")) {
            emailError.setVisibility(View.VISIBLE);
            return false;
        } else if (emailReg.getText().toString().isEmpty()) {
            emptyCheck.setVisibility(View.VISIBLE);
            return false;
        }
        return true;
    }
    // method for checking both password fields to ensure they are correct
    public boolean passwordCheck() {
        EditText passwordReg = (EditText) findViewById(R.id.passwordReg);
        EditText confirmPasswordReg = (EditText) findViewById(R.id.confirmPasswordReg);
        TextView passwordError = (TextView) findViewById(R.id.passwordError);
        TextView emptyCheck = (TextView) findViewById(R.id.emptyFieldError);

        if (!passwordReg.getText().toString().equals(confirmPasswordReg.getText().toString())) {
            passwordError.setVisibility(View.VISIBLE);

            return false;
        } else if (passwordReg.getText().toString().isEmpty() || confirmPasswordReg.getText().toString().isEmpty()) {
            emptyCheck.setVisibility(View.VISIBLE);
            return false;
        }
        return true;
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

        login = (Button) findViewById(R.id.submitLoginButton);


        //  setContentView(R.layout.activity_main); - seems useless, can we delete?
        setContentView(R.layout.activity_login);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Submit Login Button
        email = (EditText) findViewById(R.id.EmailEditReg);
        password = (EditText) findViewById(R.id.passwordEditLogin);
        login = findViewById(R.id.submitLoginButton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Initialise Strings
                emailString = email.getText().toString();
                passwordString = password.getText().toString();

                //Create User
                User currentUser = new User(emailString, passwordString);

                //Store user to pass to next activity
                Bundle bundle = new Bundle();
                bundle.putSerializable("user", currentUser);

                //Move to next activity.
                Intent searchScreen = new Intent(getApplicationContext(), searchActivity.class);
                searchScreen.putExtras(bundle);
                startActivity(searchScreen);


                //test case to check login functionality

                if (emailString.equals("test@test.com") && passwordString.equals("1234")) {
                    Intent goToSearch = new Intent(getApplicationContext(), searchActivity.class);
                    startActivity(goToSearch);
                } else if (emailString.isEmpty() || passwordString.isEmpty()) {
                    loginFail = (TextView) findViewById(R.id.loginFail);
                    loginFail.setText("Please input all information before pressing login.");
                } else{
                    loginFail.setText("Incorrect email/password, please try again.");
                }


            }
        });


        register = (Button) findViewById(R.id.RegisterButton);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (passwordCheck() == true && emailCheck() == true) {
                    Intent goToSearch = new Intent(getApplicationContext(), searchActivity.class);
                    startActivity(goToSearch);
                }
            }
        });

    }




}

