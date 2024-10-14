package com.mchung.restocknotif.repository;

import com.mchung.restocknotif.entity.UserNotificationHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserNotificationHistoryRepository extends JpaRepository<UserNotificationHistory, Long> {
}
