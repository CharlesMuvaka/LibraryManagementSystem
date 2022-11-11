package com.example.sgrDatabase.models;

import javax.persistence.*;

@Entity
@Table(name = "meals")
public class Meal {
    @Id
    @Column(name = "user_id")
    @SequenceGenerator(name = "meals_sequence",
            sequenceName = "meals_sequence",
            initialValue = 1,
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "meals_sequence")
    private int id;
    private String name;
    private String category;
    private String Origin;
    private String Description;

    public Meal() {
    }

    public Meal(String name, String category, String origin, String description) {
        this.name = name;
        this.category = category;
        Origin = origin;
        Description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
