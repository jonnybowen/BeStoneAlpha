package com.example.bestonealpha;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declare variables
    static User currentUser;

    public static User getUser() {
        return currentUser;
    }

    public void setUser(User userIn) {
        currentUser = userIn;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.AppDarkTheme);
        } else {
            setTheme(R.style.AppLightTheme);
        }

        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        TextView changeTheme = findViewById(R.id.changeTheme);
        changeTheme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                } else {
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }

                finish();
                startActivity(new Intent(MainActivity.this, MainActivity.this.getClass()));
            }
        });

        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginScreen = new Intent(getApplicationContext(), loginActivity.class);
                startActivity(loginScreen);
            }
        });
        Button searchButton = findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchScreen = new Intent(getApplicationContext(), searchActivity.class);
                startActivity(searchScreen);
            }
        });

        Button instructionButton = findViewById(R.id.instructionButton);
        instructionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUp(v);
            }
        });
    }

    public void showPopUp(View view) {
        LayoutInflater i = (LayoutInflater)
                getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = i.inflate(R.layout.popup_window, null);

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true;
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0);

        popupView.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event){
                popupWindow.dismiss();
                return true;
            }
        });
    }

}
