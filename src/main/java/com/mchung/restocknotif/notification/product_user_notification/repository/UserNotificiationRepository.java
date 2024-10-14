package com.mchung.restocknotif.notification.product_user_notification.repository;

import com.mchung.restocknotif.notification.product_user_notification.entity.UserNotification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserNotificiationRepository extends JpaRepository<UserNotification, Long> {
}
