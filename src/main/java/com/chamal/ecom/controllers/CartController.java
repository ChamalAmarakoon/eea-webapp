package com.chamal.ecom.controllers;

import com.chamal.ecom.models.Orders;
import com.chamal.ecom.repos.CartRepo;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carts")
public class CartController {

    @Autowired
    CartRepo repo;
    @CrossOrigin("*")

    @GetMapping("/{id}")
    public Optional<Orders> get(@PathVariable int id){
        return repo.findById(id);
    }
    @CrossOrigin("*")
    @GetMapping
    public List<Orders> getAll(){
        return repo.findAll();
    }

    @PostMapping
    public Order add(@RequestBody Order order){
        return repo.save(Order);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        repo.deleteById(id);
    }

}
