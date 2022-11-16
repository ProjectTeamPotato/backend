package potato.admin.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import potato.admin.domain.message.HallUpdateRequest;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "hall")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hall_id")
    Long hallId;
    String address1;
    String address2;
    @Column(name = "hall_name", nullable = false)
    String hallName;
    String phoneNumber;
    String homepage;
    String zip;

    public void update(HallUpdateRequest hallUpdateRequest) {
        this.address1 = hallUpdateRequest.getAddress1();
        this.address2 = hallUpdateRequest.getAddress2();
        this.hallName = hallUpdateRequest.getHallName();
        this.phoneNumber = hallUpdateRequest.getPhoneNumber();
        this.homepage = hallUpdateRequest.getHomepage();
        this.zip = hallUpdateRequest.getHallName();
    }
}