package potato.admin.domain.message;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import potato.admin.domain.entity.Product;

import javax.validation.constraints.NotBlank;
import java.time.Instant;
import java.util.TimeZone;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class ProductCreateRequest {

    @NotBlank(message="NAME_IS_MANDATORY")
    String productName;
    String productExplain;
    String productCondition;
    String casting;

    public Product toEntity() {
        return Product.builder()
                .productName(productName)
                .productExplain(productExplain)
                .productCondition(productCondition)
                .casting(casting)
                .build();
    }
}