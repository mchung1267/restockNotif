package com.mchung.restocknotif.product.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private Long id;
    private Long restockCount;
    private String status;
}
