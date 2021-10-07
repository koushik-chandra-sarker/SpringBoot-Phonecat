package com.inovace.Entity.PhoneDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Connectivity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bluetooth;
    private String cell;
    private boolean gps;
    private boolean infrared;
    private String wifi;

    public Connectivity() {
    }

    public Connectivity(int id, String bluetooth, String cell, boolean gps, boolean infrared, String wifi) {
        this.id = id;
        this.bluetooth = bluetooth;
        this.cell = cell;
        this.gps = gps;
        this.infrared = infrared;
        this.wifi = wifi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public boolean getGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isInfrared() {
        return infrared;
    }

    public void setInfrared(boolean infrared) {
        this.infrared = infrared;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }
}
