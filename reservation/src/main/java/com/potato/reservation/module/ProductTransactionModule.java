package com.potato.reservation.module;

import com.potato.reservation.model.entity.Product;
import com.potato.reservation.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductTransactionModule {

    private final ProductRepository productRepository;

    public Product getProduct(Long id) {
        return productRepository.findById(id).get();
    }





}
