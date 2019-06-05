package com.chamal.ecom.repos;

import com.chamal.ecom.models.Category;
import com.chamal.ecom.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
