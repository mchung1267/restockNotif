package com.mchung.restocknotif.service;

import com.mchung.restocknotif.repository.ProductNotificationRepository;
import com.mchung.restocknotif.repository.ProductRepository;
import com.mchung.restocknotif.repository.UserNotificationHistoryRepository;
import com.mchung.restocknotif.repository.UserNotificiationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final ProductRepository productRepository;
    private final ProductNotificationRepository productNotificationRepository;
    private final UserNotificiationRepository userNotificiationRepository;
    private final UserNotificationHistoryRepository userNotificationHistoryRepository;

}
