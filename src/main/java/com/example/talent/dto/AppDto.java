package com.example.talent.dto;

import com.example.talent.model.AppModel;

import java.io.Serializable;
import java.util.List;

public class AppDto implements Serializable {

    String candEmail;
    String offer;
    String resume;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    public List<AppModel> getAppModelList() {
        return appModelList;
    }

    public void setAppModelList(List<AppModel> appModelList) {
        this.appModelList = appModelList;
    }

    public List<AppModel> appModelList;

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

    String appStatus;
}
