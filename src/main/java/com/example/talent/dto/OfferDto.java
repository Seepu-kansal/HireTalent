package com.example.talent.dto;

import java.io.Serializable;

public class OfferDto implements Serializable {

    String jobTitle;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getNumOfApp() {
        return numOfApp;
    }

    public void setNumOfApp(int numOfApp) {
        this.numOfApp = numOfApp;
    }

    String startDate;
    int numOfApp;
}
