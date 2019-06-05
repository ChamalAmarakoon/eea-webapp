package com.chamal.ecom.repos;

import com.chamal.ecom.models.Product;
import com.chamal.ecom.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
