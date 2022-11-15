package potato.admin.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import potato.admin.domain.message.ProductUpdateRequest;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "product")
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long productId;

    @ManyToOne
    @JoinColumn(name="id", referencedColumnName = "id")
    private Seller seller;

    @ManyToOne
    @JoinColumn(name="hall_id", referencedColumnName = "hall_id")
    private Hall hall;

    @Column(nullable = false)
    String productName;

    @ManyToOne
    @JoinColumn(name="time", referencedColumnName = "time")
    private ProductRound productRound;

    String productExplain;
    String productCondition;
    String casting;

    public void update(ProductUpdateRequest productUpdateRequest) {
        this.productId = productId;
        this.productName = productName;
        this.productExplain = productExplain;
        this.productCondition = productCondition;
        this.casting = casting;
    }

}