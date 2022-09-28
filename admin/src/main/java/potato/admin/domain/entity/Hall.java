package potato.admin.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import potato.admin.domain.message.HallUpdateRequest;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "hall")
@AllArgsConstructor
public class Hall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long hallId;
    @Column(nullable = false)
    String hallName;
    String zip;
    String address1;
    String address2;
    String phoneNumber;
    String homepage;

    public void update(HallUpdateRequest hallUpdateRequest) {
        this.hallName = hallUpdateRequest.getHallName();
        this.zip = hallUpdateRequest.getHallName();
        this.address1 = hallUpdateRequest.getAddress1();
        this.address2 = hallUpdateRequest.getAddress2();
        this.phoneNumber = hallUpdateRequest.getPhoneNumber();
        this.homepage = hallUpdateRequest.getHomepage();
    }
}