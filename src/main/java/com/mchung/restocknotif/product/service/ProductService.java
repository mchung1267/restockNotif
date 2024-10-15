package com.mchung.restocknotif.product.service;

import com.mchung.restocknotif.notification.product_notification.dto.ProductNotificationDto;
import com.mchung.restocknotif.notification.product_notification.entity.ProductNotificationHistory;
import com.mchung.restocknotif.notification.product_notification.repository.ProductNotificationRepository;
import com.mchung.restocknotif.notification.product_user_notification.dto.HistoryDto;
import com.mchung.restocknotif.notification.product_user_notification.dto.NotificationDto;
import com.mchung.restocknotif.notification.product_user_notification.entity.UserNotification;
import com.mchung.restocknotif.product.dto.ProductDto;
import com.mchung.restocknotif.product.entity.Product;
import com.mchung.restocknotif.product.repository.ProductRepository;
import com.mchung.restocknotif.notification.product_user_notification.repository.UserNotificationHistoryRepository;
import com.mchung.restocknotif.notification.product_user_notification.repository.UserNotificiationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public void sendNotification(Long productId) {
        Random random = new Random();
        List<UserNotification> subscribed = userNotificiationRepository.findAllByProductId(productId);
        Long[] userIds = new Long[subscribed.size()];
        List<ProductNotificationHistory> history = productNotificationRepository.findByProductId(productId);
        ProductNotificationDto productNotificationDto = new ProductNotificationDto();
        ProductNotificationHistory product = new ProductNotificationHistory();
        Product product1 = productRepository.findById(productId).orElseThrow(() -> new IllegalArgumentException("해당 상품은 존재하지 않습니다"));
        ProductDto productDto = new ProductDto();
        productDto.setId(productId);
        if(history.size() == 0) {
            product.setRestockCount(0L);
            product.setIsSent(false);
            product.setLastUserId(0L);
            productNotificationRepository.save(product);
        } else {
            productNotificationDto.setId(history.get(0).getId());
            productNotificationDto.setIsSent(history.get(0).getIsSent());
            productNotificationDto.setRestockCount(history.get(0).getRestockCount());
            productNotificationDto.setLastUserId(history.get(0).getLastUserId());
        }
        int maxNoti = random.nextInt(500);
        int notiCount = 0;
        for(int i = 0; i < subscribed.size(); i++) {
            userIds[i] = subscribed.get(i).getId();
        }
        productNotificationDto.setRestockCount(productNotificationDto.getRestockCount() + 1);
        productDto.setRestockCount(productDto.getRestockCount() + 1);
        for (UserNotification userNotification : subscribed) {
            if (notiCount < maxNoti) {
                productNotificationDto.setIsSent(true);
                productNotificationDto.setLastUserId(userNotification.getId());
                updateHistory(productNotificationDto, userNotification.getId());
                notiCount++;
            }
            if(notiCount >= maxNoti) {
                productDto.setStatus("COMPLETED");
                product1.update(productDto);
                break;
            }
        }
    }
    @Transactional
    public void updateHistory(ProductNotificationDto productNotificationDto, Long id) {
        ProductNotificationHistory history = productNotificationRepository.findByProductId(id).get(0);
        history.setId(productNotificationDto.getId());
        history.setIsSent(productNotificationDto.getIsSent());
        history.setLastUserId(productNotificationDto.getLastUserId());
        history.setRestockCount(productNotificationDto.getRestockCount());
        history.update(productNotificationDto);


    }
}
