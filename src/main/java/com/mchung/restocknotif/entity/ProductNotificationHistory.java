package com.mchung.restocknotif.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="ProductNotificationHistory")
public class ProductNotificationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="productId", nullable = false)
    private Long productId;

    @Column(name="message", nullable = false)
    private String message;
}
