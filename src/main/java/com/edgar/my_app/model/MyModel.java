package com.edgar.my_app.model;

import java.util.List;

public class MyModel {
    int id;
    String firstName;
    String lastName;
    String occupation;
    String phoneNumber;
    List<String> hobbies;

    public MyModel(final int id, final String firstName, final String lastName, final String occupation, final String phoneNumber, final List<String> hobbies) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.phoneNumber = phoneNumber;
        this.hobbies = hobbies;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(final String occupation) {
        this.occupation = occupation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(final List<String> hobbies) {
        this.hobbies = hobbies;
    }
}