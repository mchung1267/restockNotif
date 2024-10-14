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
@Table(name="ProductUserNotificationHistory")
public class UserNotificationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="userId", nullable = false)
    private Long userId;
    @Column(name="restockCount", nullable = false)
    private Long restockCount;
    @Column(name="shippedTime", nullable = false)
    private Timestamp shippedTime;
}
