package com.mchung.restocknotif.notification.product_notification.repository;

import com.mchung.restocknotif.notification.product_notification.entity.ProductNotificationHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductNotificationRepository extends JpaRepository<ProductNotificationHistory, Long> {
}
