package com.mchung.restocknotif.notification.product_user_notification.repository;

import com.mchung.restocknotif.notification.product_user_notification.entity.UserNotificationHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserNotificationHistoryRepository extends JpaRepository<UserNotificationHistory, Long> {
}
