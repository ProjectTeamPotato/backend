package potato.admin.domain.message;


import lombok.AllArgsConstructor;
import lombok.Builder;
import potato.admin.domain.entity.Hall;
import potato.admin.domain.entity.Product;
import potato.admin.domain.entity.ProductRound;
import potato.admin.domain.entity.Seller;

import java.time.Instant;
import java.util.List;

@Builder
@AllArgsConstructor
public class ProductGetResponse {
    Long productId;
    Long sellerId;
    Long hallId;
    String productName;
    String productExplain;
    String productCondition;
    String casting;
    List<ProductRound> time;

    static public ProductGetResponse of(Product product) {
        ProductGetResponse productGetResponse = ProductGetResponse.builder()
                .productId(product.getProductId())
                .sellerId(product.getSeller().getId())
                .hallId(product.getHall().getHallId())
                .productName(product.getProductName())
                .productExplain(product.getProductExplain())
                .productCondition(product.getProductCondition())
                .casting(product.getCasting())
                .time(product.getTimes())
                .build();
        return productGetResponse;
    }
}