package com.inovace.Entity.PhoneDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Android {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String os;
    private String ui;

    public Android() {
    }
    public Android(int id, String os, String ui) {
        this.id = id;
        this.os = os;
        this.ui = ui;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getUi() {
        return ui;
    }

    public void setUi(String ui) {
        this.ui = ui;
    }
}
