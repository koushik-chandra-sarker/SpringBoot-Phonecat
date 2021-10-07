package com.inovace.Entity.PhoneDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Battery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private  String standbyTime;
    private  String talkTime;
    private String type;

    public Battery() {
    }

    public Battery(int id, String standbyTime, String talkTime, String type) {
        this.id = id;
        this.standbyTime = standbyTime;
        this.talkTime = talkTime;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStandbyTime() {
        return standbyTime;
    }

    public void setStandbyTime(String standbyTime) {
        this.standbyTime = standbyTime;
    }

    public String getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(String talkTime) {
        this.talkTime = talkTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
