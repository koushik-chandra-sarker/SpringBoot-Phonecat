package com.inovace.Entity.PhoneDetails;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
public class SizeAndWeight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String weight;
    @OneToMany(targetEntity = Dimension.class, cascade = {CascadeType.ALL})
    @JoinColumn(name = "dimension_id", referencedColumnName = "id")
    @JsonProperty("dimensions")
    private List<Dimension> dimensions;

    public SizeAndWeight() {
    }

    public SizeAndWeight(int id, String weight, List<Dimension> dimensions) {
        this.id = id;
        this.weight = weight;
        this.dimensions = dimensions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public List<Dimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<Dimension> dimensions) {
        this.dimensions = dimensions;
    }
}
