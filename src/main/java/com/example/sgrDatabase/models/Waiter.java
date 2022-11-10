package com.example.sgrDatabase.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "waiter",
            uniqueConstraints = {
            @UniqueConstraint(name = "waiter_workNumber", columnNames = "worker_number"),
            @UniqueConstraint(name = "waiter_email_address", columnNames = "worker_email_address"),
            @UniqueConstraint(name = "waiter_phone_number", columnNames = "worker_phone_number"),
            })
public class Waiter {
    private int id;
    private int workNumber;
    private int userPhoneNumber;
    private String name;
    private String emailAddress;

    public Waiter(){}

    public Waiter(int workNumber, int userPhoneNumber, String name, String emailAddress) {
        this.workNumber = workNumber;
        this.userPhoneNumber = userPhoneNumber;
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(int workNumber) {
        this.workNumber = workNumber;
    }

    public int getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(int userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
