package com.chamal.ecom.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;

    private String orderStatus;
    private  int userid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "orders",fetch = FetchType.EAGER)
    List <OrderedProducts> orderedProducts;





}
