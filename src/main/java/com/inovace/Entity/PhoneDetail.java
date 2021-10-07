package com.inovace.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.inovace.Entity.PhoneDetails.*;

import javax.persistence.*;
import java.util.List;

@Entity
public class PhoneDetail {
    @Id
    private String id;
    private String additionalFeatures;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty("android")
    private Android android;
    @OneToMany(targetEntity = Availability.class, cascade = {CascadeType.ALL})
    @JsonProperty("availabilityList")
    @JoinColumn(name = "availability_id", referencedColumnName = "id")
    private List<Availability> availabilityList;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty("battery")
    private Battery battery;
    @JsonProperty("camera")
    @OneToOne(cascade = CascadeType.ALL)
    private Camera camera;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty("connectivity")
    private Connectivity connectivity;
    @Column(length = 1000)
    private String description;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty("display")
    private Display display;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty("hardware")
    private Hardware hardware;
    @OneToMany(targetEntity = Image.class, cascade = {CascadeType.ALL})
    @JsonProperty("images")
    @JoinColumn(name = "image_id", referencedColumnName = "id")
    private List<Image> images;
    private String Name;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty("sizeAndWeight")
    private SizeAndWeight sizeAndWeight;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty("storage")
    private Storage storage;

    public PhoneDetail() {
    }

    public PhoneDetail(String id,
                       String additionalFeatures,
                       Android android,
                       List<Availability> availabilityList,
                       Battery battery,
                       Camera camera,
                       Connectivity connectivity,
                       String description,
                       Display display,
                       Hardware hardware,
                       List<Image> images,
                       String name,
                       SizeAndWeight sizeAndWeight,
                       Storage storage) {
        this.id = id;
        this.additionalFeatures = additionalFeatures;
        this.android = android;
        this.availabilityList = availabilityList;
        this.battery = battery;
        this.camera = camera;
        this.connectivity = connectivity;
        this.description = description;
        this.display = display;
        this.hardware = hardware;
        this.images = images;
        Name = name;
        this.sizeAndWeight = sizeAndWeight;
        this.storage = storage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAdditionalFeatures() {
        return additionalFeatures;
    }

    public void setAdditionalFeatures(String additionalFeatures) {
        this.additionalFeatures = additionalFeatures;
    }

    public Android getAndroid() {
        return android;
    }

    public void setAndroid(Android android) {
        this.android = android;
    }

    public List<Availability> getAvailabilityList() {
        return availabilityList;
    }

    public void setAvailabilityList(List<Availability> availabilityList) {
        this.availabilityList = availabilityList;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Connectivity getConnectivity() {
        return connectivity;
    }

    public void setConnectivity(Connectivity connectivity) {
        this.connectivity = connectivity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Hardware getHardware() {
        return hardware;
    }

    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public SizeAndWeight getSizeAndWeight() {
        return sizeAndWeight;
    }

    public void setSizeAndWeight(SizeAndWeight sizeAndWeight) {
        this.sizeAndWeight = sizeAndWeight;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }
}
