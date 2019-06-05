package com.chamal.ecom.controllers;

import com.chamal.ecom.models.Category;
import com.chamal.ecom.models.Product;
import com.chamal.ecom.repos.CategoryRepo;
import com.chamal.ecom.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryRepo repo;

    @GetMapping("/{id}")
    public Optional<Category> get(@PathVariable int id){
        return repo.findById(id);
    }
    @CrossOrigin("*")
    @GetMapping
    public List<Category> getAll(){
        return repo.findAll();
    }

    @PostMapping
    public Category add(@RequestBody Category category){
        return repo.save(category);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        repo.deleteById(id);
    }

}
