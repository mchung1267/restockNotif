package com.mchung.restocknotif.notification.product_notification.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductNotificationDto {
    private Long id;
    private Long restockCount;
    private Boolean isSent;
    private Long lastUserId;
}
