package potato.admin.domain.message;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ProductUpdateRequest {
    String productName;
    Instant time;
    String productExplain;
    String productCondition;
    String casting;
}

