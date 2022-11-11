package com.example.sgrDatabase.models;

import javax.persistence.*;

@Entity
@Table(name = "user",
        uniqueConstraints = {
                @UniqueConstraint(name = "user_idNumber", columnNames = "user_number"),
                @UniqueConstraint(name = "user_email_address", columnNames = "user_email_address"),
                @UniqueConstraint(name = "user_phone_number", columnNames = "user_phone_number"),
        })
public class User {
    @Id
    @Column(name = "user_id")
    @SequenceGenerator(name = "user_sequence",
            sequenceName = "user_sequence",
            initialValue = 1,
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "user_sequence")
    private int id;
    private int userIdNumber;
    private int userPhoneNumber;
    private String name;
    private String seatNumber;
    private String coachNumber;
    private String emailAddress;

    public User(){

    }

    public User(int userIdNumber, int userPhoneNumber, String name, String seatNumber, String coachNumber, String emailAddress) {
        this.userIdNumber = userIdNumber;
        this.userPhoneNumber = userPhoneNumber;
        this.name = name;
        this.seatNumber = seatNumber;
        this.coachNumber = coachNumber;
        this.emailAddress = emailAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserIdNumber() {
        return userIdNumber;
    }

    public void setUserIdNumber(int userIdNumber) {
        this.userIdNumber = userIdNumber;
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

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getCoachNumber() {
        return coachNumber;
    }

    public void setCoachNumber(String coachNumber) {
        this.coachNumber = coachNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
