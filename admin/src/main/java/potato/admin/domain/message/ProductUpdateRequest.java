package potato.admin.domain.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductUpdateRequest {
    Long productId;
    Long sellerId;
    Long hallId;
    String productName;
    Long time;
    String productExplain;
    String productCondition;
    String casting;
}
