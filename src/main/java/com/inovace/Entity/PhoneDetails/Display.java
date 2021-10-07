package com.inovace.Entity.PhoneDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Display {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String screenResolution;
    private String screenSize;
    private boolean touchScreen;

    public Display() {
    }

    public Display(int id, String screenResolution, String screenSize, boolean touchScreen) {
        this.id = id;
        this.screenResolution = screenResolution;
        this.screenSize = screenSize;
        this.touchScreen = touchScreen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }
}
