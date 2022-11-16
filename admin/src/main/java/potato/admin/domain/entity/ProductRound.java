package potato.admin.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.TimeZone;

@Getter
@Entity
@Table(name = "product_round")
@AllArgsConstructor
@NoArgsConstructor
public class ProductRound {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long productRoundId;
    Long day;
    Long productId;
    Long round;
    Long year;
    Long month;
    @Column(name = "time")
    Instant time;
    TimeZone globalTime;
    String grade;
}
