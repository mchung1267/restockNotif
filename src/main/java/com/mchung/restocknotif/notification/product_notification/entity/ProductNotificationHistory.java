package com.mchung.restocknotif.notification.product_notification.entity;

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

    @Column(name="restockCount", nullable = false)
    private Long restockCount;
    @Column(name="isSent", nullable = false)
    private Boolean isSent;
    @Column(name="lastUserId", nullable = false)
    private Long lastUserId;
}
