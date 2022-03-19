package com.example.library.repository;

import com.example.library.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
        List<Product> findAllByDeletedFalse();
        Optional<Product> findByIdAndDeletedFalse(Long id);
}
