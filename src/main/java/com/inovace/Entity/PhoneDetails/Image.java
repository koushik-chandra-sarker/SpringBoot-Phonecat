package com.inovace.Entity.PhoneDetails;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.inovace.Entity.PhoneDetail;

import javax.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String src;
    private String thumbnail;
    @ManyToOne
    @JsonProperty("phoneDetail")
    private PhoneDetail phoneDetail;
    public Image() {
    }

    public Image(int id, String src, String thumbnail) {
        this.id = id;
        this.src = src;
        this.thumbnail = thumbnail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

}
