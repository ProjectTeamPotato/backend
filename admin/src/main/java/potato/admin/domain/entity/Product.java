package potato.admin.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import potato.admin.domain.message.ProductUpdateRequest;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Entity
@Table(name = "product")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long productId;

    @ManyToOne
    @JoinColumn(name="id", referencedColumnName = "id")
    private Seller seller;

    @OneToOne
    @JoinColumn(name="hall_id", referencedColumnName = "hall_id")
    private Hall hall;

    @Column(nullable = false)
    String productName;

    String productExplain;
    String productCondition;
    String casting;

    @OneToMany
    @JoinColumn(name="time", referencedColumnName = "time")
    private List<ProductRound> times = new ArrayList<>();

    public void update(ProductUpdateRequest productUpdateRequest) {
        this.productName = productUpdateRequest.getProductName();
        this.productExplain = productUpdateRequest.getProductExplain();
        this.productCondition = productUpdateRequest.getProductCondition();
        this.casting = productUpdateRequest.getCasting();
    }

}