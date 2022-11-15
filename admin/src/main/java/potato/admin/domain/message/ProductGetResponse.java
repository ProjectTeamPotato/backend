package potato.admin.domain.message;


import lombok.AllArgsConstructor;
import potato.admin.domain.entity.Hall;
import potato.admin.domain.entity.Product;
import potato.admin.domain.entity.Seller;

@AllArgsConstructor
public class ProductGetResponse {
    Long productId;
    Long sellerId;
    Long hallId;
    String productName;
    Long time;
    String productExplain;
    String productCondition;
    String casting;

    static public ProductGetResponse of(Product product) {
        return new ProductGetResponse(product.getProductId(), product.getSeller().getId(), product.getHall().getHallId(), product.getProductName(),
                product.getProductRound().getTime(), product.getProductExplain(), product.getProductCondition(), product.getCasting());
    }
}
