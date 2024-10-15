package com.mchung.restocknotif.notification.product_user_notification.repository;

import com.mchung.restocknotif.notification.product_user_notification.entity.UserNotification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserNotificiationRepository extends JpaRepository<UserNotification, Long> {
    List<UserNotification> findAllByProductId(Long productId);
}
