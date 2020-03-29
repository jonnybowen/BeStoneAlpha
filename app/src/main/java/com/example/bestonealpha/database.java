package com.example.bestonealpha;

import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;


public class dbHandler extends SQLiteOpenHelper{

    private static final String DB_NAME = "beStonedb";
    private static final int DB_VERSION = 1;
    private static final String TABLE_USERS = "Users";

    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_DISPLAY_NAME = "display name";


    dbHandler(Context context)   {
        super(context, DB_NAME, null, DB_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE USER ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "EMAIL TEXT, "
                + "DISPLAY_NAME TEXT, "
                + "PASSWORD TEXT, "
                + "TUTOR_STATUS NUMERIC);");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    private void registerUser(User user) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_EMAIL, user.getEmail());
        values.put(COLUMN_PASSWORD, user.getPassword());
        values.put(COLUMN_DISPLAY_NAME, user.getDisplayName());
        values.put(COLUMN_EMAIL, user.getEmail());

        SQLiteDatabase db = this.getWritableDatabase();

        db.insert(TABLE_USERS, null, values);
        db.close();
    }

    }
