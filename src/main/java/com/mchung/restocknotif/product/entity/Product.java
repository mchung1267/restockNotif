package com.mchung.restocknotif.product.entity;

import com.mchung.restocknotif.product.dto.ProductDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="restockCount", nullable = false)
    private Long restockCount;

    @Column(name="status", nullable = false)
    private String status;

    public void update(ProductDto productDto) {
        this.restockCount = productDto.getRestockCount();
        this.status = productDto.getStatus();
    }
}
