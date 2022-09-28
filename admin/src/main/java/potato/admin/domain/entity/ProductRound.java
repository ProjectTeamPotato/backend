package potato.admin.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import javax.persistence.*;

@Getter
@Entity
@Table(name = "product_round")
@AllArgsConstructor
public class ProductRound {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long productRoundId;
    Long productId;
    Long round;
    Long year;
    Long month;
    Long day;
    Long time;
    String grade;
}
