package potato.admin.domain.message;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import potato.admin.domain.entity.Hall;
import potato.admin.domain.entity.Product;
import potato.admin.domain.entity.ProductRound;
import potato.admin.domain.entity.Seller;

import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class ProductCreateRequest {
    Long productId;
    Long sellerId;
    Long hallId;
    String productName;
    Long time;
    String productExplain;
    String productCondition;
    String casting;

    public Product toEntity() {
        return new Product(null, null, null, productName, null, productExplain, productCondition, casting);
    }
}