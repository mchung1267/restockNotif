package com.mchung.restocknotif.notification.product_user_notification.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="ProducUserNotification")
public class UserNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="productId", nullable = false)
    private Long productId;
    @Column(name="isActive", nullable = false)
    private Boolean isActive;
    @Column(name="createdAt", nullable = false)
    private Timestamp createdAt;
    @Column(name="updatedAt", nullable = false)
    private Timestamp updatedAt;
}
