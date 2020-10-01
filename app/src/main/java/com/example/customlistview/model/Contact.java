package com.example.customlistview.model;

public class Contact {
    private String name;
    private String phoneNumber;
    private int color;

    public Contact(String name, String phoneNumber, int color) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}