package com.mchung.restocknotif.entity;

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

    @Column(name="inStock", nullable = false)
    private Boolean inStock;

    @Column(name="stockCount", nullable = false)
    private Long stockCount;

    @Column(name="name", nullable = false)
    private String name;
}
