package com.example.talent.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity(name = "offer")
public class OfferEntity{

    @Id
    @Column(nullable = false, unique = true)
    String jobTitle;
    @Column(nullable = false)
    String date;

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

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

    public String getNumOfApp() {
        return numOfApp;
    }

    public void setNumOfApp(String numOfApp) {
        this.numOfApp = numOfApp;
    }

    @Column(nullable = false)
    String numOfApp;

    @OneToOne(mappedBy="offerEntity")
    @Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    private AppEntity appEntity;

}
