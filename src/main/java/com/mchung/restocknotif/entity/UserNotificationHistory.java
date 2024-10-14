package com.mchung.restocknotif.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @Column(name="notiId", nullable = false)
    private Long notiId;

    @Column(name="productId", nullable = false)
    private Long productId;
}
