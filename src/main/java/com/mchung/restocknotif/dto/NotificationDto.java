package com.mchung.restocknotif.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationDto {
    private Long id;
    private Long productId;
    private String message;
}
