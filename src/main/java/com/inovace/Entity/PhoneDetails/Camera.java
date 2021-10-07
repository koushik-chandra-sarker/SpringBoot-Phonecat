package com.inovace.Entity.PhoneDetails;



import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
public class Camera {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String primaryCamera;
    private String secondaryCamera;
    @OneToMany(targetEntity = Feature.class, cascade = {CascadeType.ALL})
    @JoinColumn(name = "feature_id", referencedColumnName = "id")
    @JsonProperty("features")
    private List<Feature> features;

    public Camera() {
    }


    public Camera(int id, String primaryCamera, String secondaryCamera, List<Feature> features) {
        this.id = id;
        this.primaryCamera = primaryCamera;
        this.secondaryCamera = secondaryCamera;
        this.features = features;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public String getPrimaryCamera() {
        return primaryCamera;
    }

    public void setPrimaryCamera(String primary) {
        this.primaryCamera = primary;
    }

    public String getSecondaryCamera() {
        return secondaryCamera;
    }

    public void setSecondaryCamera(String secondary) {
        this.secondaryCamera = secondary;
    }

}
