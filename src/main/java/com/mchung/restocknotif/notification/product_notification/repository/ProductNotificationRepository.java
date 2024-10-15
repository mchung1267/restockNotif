package com.mchung.restocknotif.notification.product_notification.repository;

import com.mchung.restocknotif.notification.product_notification.entity.ProductNotificationHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductNotificationRepository extends JpaRepository<ProductNotificationHistory, Long> {
    List<ProductNotificationHistory> findByProductId(Long productId);
}
