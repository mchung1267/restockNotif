package com.mchung.restocknotif.repository;

import com.mchung.restocknotif.entity.UserNotification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserNotificiationRepository extends JpaRepository<UserNotification, Long> {
}
