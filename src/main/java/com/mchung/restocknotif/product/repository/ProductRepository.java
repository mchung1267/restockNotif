package com.mchung.restocknotif.product.repository;

import com.mchung.restocknotif.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
