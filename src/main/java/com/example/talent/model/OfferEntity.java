package com.example.talent.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity(name = "offer")
public class OfferEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false, unique = true)
    String jobTitle;

    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
    @Column(nullable = false)
    String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumOfApp() {
        return numOfApp;
    }

    public void setNumOfApp(int numOfApp) {
        this.numOfApp = numOfApp;
    }

    @Column(nullable = false)
    int numOfApp;

}
