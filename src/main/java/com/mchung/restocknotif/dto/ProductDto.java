package com.mchung.restocknotif.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private Long id;
    private Boolean inStock;
    private Long stockCount;
}
