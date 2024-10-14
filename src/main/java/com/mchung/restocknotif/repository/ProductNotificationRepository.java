package com.mchung.restocknotif.repository;

import com.mchung.restocknotif.entity.ProductNotificationHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductNotificationRepository extends JpaRepository<ProductNotificationHistory, Long> {
}
