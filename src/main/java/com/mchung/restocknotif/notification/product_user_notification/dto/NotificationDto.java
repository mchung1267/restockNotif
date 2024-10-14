package com.mchung.restocknotif.notification.product_user_notification.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class NotificationDto {
    private Long id;
    private Long productId;
    private Boolean isActive;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
