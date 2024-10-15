package com.mchung.restocknotif.product.service;

import com.mchung.restocknotif.notification.product_notification.dto.ProductNotificationDto;
import com.mchung.restocknotif.notification.product_notification.repository.ProductNotificationRepository;
import com.mchung.restocknotif.notification.product_user_notification.dto.HistoryDto;
import com.mchung.restocknotif.notification.product_user_notification.dto.NotificationDto;
import com.mchung.restocknotif.notification.product_user_notification.entity.UserNotification;
import com.mchung.restocknotif.product.repository.ProductRepository;
import com.mchung.restocknotif.notification.product_user_notification.repository.UserNotificationHistoryRepository;
import com.mchung.restocknotif.notification.product_user_notification.repository.UserNotificiationRepository;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductNotificationRepository productNotificationRepository;
    private final UserNotificiationRepository userNotificiationRepository;
    private final UserNotificationHistoryRepository userNotificationHistoryRepository;

    public void sendNotification(Long productId) {
        Random random = new Random();
        List<UserNotification> subscribed = userNotificiationRepository.findAllByProductId(productId);
        Long[] userIds = new Long[subscribed.size()];
        for(int i = 0; i < subscribed.size(); i++) {
            userIds[i] = subscribed.get(i).getId();
        }
        int maxNoti = random.nextInt(500);
        for(int i = 0; i < maxNoti; i++) {


        }
    }
}
