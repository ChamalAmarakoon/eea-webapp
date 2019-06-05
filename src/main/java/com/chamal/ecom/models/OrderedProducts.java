package com.chamal.ecom.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class OrderedProducts {
    private int id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    Orders orders;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "product_id" , referencedColumnName = "id")
    Product product;
}