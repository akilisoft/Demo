package com.akilisoft.tech.demo.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.akilisoft.tech.demo.Model.User;

/**
 * Copyright (c) 2020, NIKISS. All Rights Reserved.
 * <p>
 * Save to the extent permitted by law, you may not use, copy, modify, distribute or
 * create derivative works of this material or any part of it without the prior
 * written consent of  OUEDRAOGO ISSOUF NIKISS.email:ouedraogo.nikiss@gmail.com
 * <p>
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the software.
 * Created on 08,octobre,2020
 */
public class DatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    protected static final String DATABASE_NAME = "resto.sqlite";


    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //First created parent table , independante table

        db.execSQL(User.CREATE_TABLE);
        //db.execSQL(Symptom.CREATE_TABLE);
        //db.execSQL(Prevention.CREATE_TABLE);
        //Second created child table, Table with FOREIGN KEY


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        // First Drop Table with Foreign Key

        db.execSQL("DROP TABLE IF EXISTS " + User.TABLE_NAME);
        //db.execSQL("DROP TABLE IF EXISTS " + Symptom.TABLE_NAME);
        //db.execSQL("DROP TABLE IF EXISTS " + Prevention.TABLE_NAME);

        onCreate(db);
    }

}
