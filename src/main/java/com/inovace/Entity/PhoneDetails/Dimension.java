package com.inovace.Entity.PhoneDetails;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
public class Dimension {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String details;

    public Dimension() {
    }

    public Dimension(int id, String details, SizeAndWeight sizeAndWeight) {
        this.id = id;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
