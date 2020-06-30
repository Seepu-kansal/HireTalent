package com.example.talent.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity(name = "applications")
public class AppEntity{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    @GenericGenerator(name = "gen", strategy = "foreign", parameters = {@org.hibernate.annotations.Parameter(name = "property", value = "offerEntity")})
    int id;

    @Column(nullable = false, unique = true)
    String candEmail;

    @Column(nullable = false)
    String offer;

    public String getCandEmail() {
        return candEmail;
    }

    public void setCandEmail(String candEmail) {
        this.candEmail = candEmail;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public String getResume() {
        return resume;
    }


    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    @Column(nullable = false)
    String resume;

    @Column
    String appStatus;

    @OneToOne
    @PrimaryKeyJoinColumn
    private OfferEntity offerEntity;
}
