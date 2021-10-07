package com.inovace.Entity.PhoneDetails;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Availability {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
//    @ManyToOne
//    @JsonProperty("availability")
//    private Availability availability;

    public Availability() {
    }

    public Availability(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Availability getAvailability() {
//        return availability;
//    }
//
//    public void setAvailability(Availability availability) {
//        this.availability = availability;
//    }
}
