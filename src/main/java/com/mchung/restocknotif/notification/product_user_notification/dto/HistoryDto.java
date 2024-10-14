package com.mchung.restocknotif.notification.product_user_notification.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class HistoryDto {
    private Long id;
    private Long userId;
    private Long restockCount;
    private Timestamp shippedTime;
}
