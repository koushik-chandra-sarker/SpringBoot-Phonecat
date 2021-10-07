package com.inovace.Entity.PhoneDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hardware {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private boolean accelerometer;
    private String audioJack;
    private String cpu;
    private boolean fmRadio;
    private boolean physicalKeyboard;
    private String usb;

    public Hardware() {
    }

    public Hardware(int id, boolean accelerometer, String audioJack, String cpu, boolean fmRadio, boolean physicalKeyboard, String usb) {
        this.id = id;
        this.accelerometer = accelerometer;
        this.audioJack = audioJack;
        this.cpu = cpu;
        this.fmRadio = fmRadio;
        this.physicalKeyboard = physicalKeyboard;
        this.usb = usb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAccelerometer() {
        return accelerometer;
    }

    public void setAccelerometer(boolean accelerometer) {
        this.accelerometer = accelerometer;
    }

    public String getAudioJack() {
        return audioJack;
    }

    public void setAudioJack(String audioJack) {
        this.audioJack = audioJack;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public boolean isFmRadio() {
        return fmRadio;
    }

    public void setFmRadio(boolean fmRadio) {
        this.fmRadio = fmRadio;
    }

    public boolean isPhysicalKeyboard() {
        return physicalKeyboard;
    }

    public void setPhysicalKeyboard(boolean physicalKeyboard) {
        this.physicalKeyboard = physicalKeyboard;
    }

    public String getUsb() {
        return usb;
    }

    public void setUsb(String usb) {
        this.usb = usb;
    }
}
