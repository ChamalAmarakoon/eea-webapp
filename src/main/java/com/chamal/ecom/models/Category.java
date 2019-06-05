package com.chamal.ecom.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int catid;
    private String catname;
    private String catimageUrl;

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    public String getCatimageUrl() {
        return catimageUrl;
    }

    public void setCatimageUrl(String catimageUrl) {
        this.catimageUrl = catimageUrl;
    }
}
