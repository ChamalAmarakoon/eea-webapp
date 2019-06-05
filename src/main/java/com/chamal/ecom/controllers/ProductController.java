package com.chamal.ecom.controllers;

import com.chamal.ecom.models.Product;
import com.chamal.ecom.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    ProductRepo repo;
    @CrossOrigin("*")

    @GetMapping("/{id}")
    public Optional<Product> get(@PathVariable int id){
        return repo.findById(id);
    }


    @CrossOrigin("*")
    @GetMapping
    public List<Product> getAll(){
        return repo.findAll();
    }

    @PostMapping
    public Product add(@RequestBody Product product){
        return repo.save(product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        repo.deleteById(id);
    }

}
