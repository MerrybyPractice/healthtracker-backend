package com.healthtracker.healthTracker;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Entry {

    @Column
    private String title;
    private String quantity;
    private String description;
    private String timestamp;



    @GeneratedValue
    @Id
    private long id;

    public Entry(String title, String quantity, String description, String timestamp){
        this.title = title;
        this.quantity = quantity;
        this.description = description;
        this.timestamp = timestamp;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public long getId() {
        return id;
    }
}
