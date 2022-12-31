package com.potato.reservation.module;

import com.potato.reservation.model.entity.Basket;
import com.potato.reservation.model.entity.BasketUUID;
import com.potato.reservation.model.entity.Product;
import com.potato.reservation.repository.BasketRepository;
import com.potato.reservation.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class BasketTransactionModule {

    private final BasketRepository basketRepository;
    private final ProductTransactionModule productTransactionModule;

    public Long getBasketPrice(UUID basketUuid) {

        BasketUUID basketUUID = BasketUUID.builder()
                .uuid(basketUuid)
                .build();

        List<Basket> basketList = basketRepository.findByBasketUuid(basketUUID);

        return (Long) basketList.stream()
                .mapToLong(basket -> productTransactionModule.getProduct(basket.getProductId()).getPrice())
                .sum();
    }

}
