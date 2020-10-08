package com.akilisoft.tech.demo.Model;

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
public class User {
    public static final String TABLE_NAME = "users";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_LASTNAME = "lastname";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_GENDER = "gender";
    public static final String COLUMN_TYPE = "type";
    public static final String COLUMN_COUNTRY_RESIDENCE = "country";
    public static final String COLUMN_CITY_RESIDENCE = "city";
    public static final String COLUMN_PICTURE = "picture";



    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + "  INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_EMAIL + " VARCHAR(32) NOT NULL UNIQUE,"
                    + COLUMN_PASSWORD + " VARCHAR(32) NOT NULL,"
                    + COLUMN_NAME + " VARCHAR(32),"
                    + COLUMN_LASTNAME + " VARCHAR(32) ,"
                    + COLUMN_PHONE + " VARCHAR(32) ,"
                    + COLUMN_GENDER + " VARCHAR(32),"
                    + COLUMN_TYPE + " VARCHAR(32) NOT NULL,"
                    + COLUMN_COUNTRY_RESIDENCE + " VARCHAR(32) ,"
                    + COLUMN_CITY_RESIDENCE + " VARCHAR(32) ,"
                    + COLUMN_PICTURE + " TEXT"
                    + ")";


    private String id;
    private String email;
    private String password;
    private String name;
    private String lastname;
    private String phone;
    private String gender;
    private String type;
    private String country;
    private String city;
    private String picture;

    public User() {
    }

    public User(String email, String password,String type) {
        this.email = email;
        this.password = password;
        this.type= type;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
