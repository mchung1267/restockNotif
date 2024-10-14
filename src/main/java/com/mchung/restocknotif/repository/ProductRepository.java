package com.mchung.restocknotif.repository;

import com.mchung.restocknotif.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
