package com.mchung.restocknotif.product.controller;

import com.mchung.restocknotif.product.service.ProductService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    ProductService productService;
    @PostMapping("/{productId}/notifications/re-stock")
    public void sendRestockNotification(@PathVariable Long productId) {
        productService.sendNotification(productId);
    }
}
