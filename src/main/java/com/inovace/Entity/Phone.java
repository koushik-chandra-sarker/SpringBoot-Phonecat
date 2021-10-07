package com.inovace.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
public class Phone {
    @Id
    private String  id;
    private int age;
    private String imageUrl;
    private String name;
    private String snippet;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonProperty("phoneDetail")
    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    private PhoneDetail phoneDetail;

    public Phone() {
    }

    public Phone(String id, int age, String imageUrl, String name, String snippet, PhoneDetail phoneDetail) {
        this.id = id;
        this.age = age;
        this.imageUrl = imageUrl;
        this.name = name;
        this.snippet = snippet;
        this.phoneDetail = phoneDetail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public PhoneDetail getPhoneDetail() {
        return phoneDetail;
    }

    public void setPhoneDetail(PhoneDetail phoneDetail) {
        this.phoneDetail = phoneDetail;
    }
}
