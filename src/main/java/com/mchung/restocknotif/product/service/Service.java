package com.mchung.restocknotif.product.service;

import com.mchung.restocknotif.notification.product_notification.repository.ProductNotificationRepository;
import com.mchung.restocknotif.product.repository.ProductRepository;
import com.mchung.restocknotif.notification.product_user_notification.repository.UserNotificationHistoryRepository;
import com.mchung.restocknotif.notification.product_user_notification.repository.UserNotificiationRepository;
import lombok.RequiredArgsConstructor;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {
    private final ProductRepository productRepository;
    private final ProductNotificationRepository productNotificationRepository;
    private final UserNotificiationRepository userNotificiationRepository;
    private final UserNotificationHistoryRepository userNotificationHistoryRepository;
}
