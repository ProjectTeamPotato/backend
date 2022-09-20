package potato.admin.domain.entity;

import lombok.AllArgsConstructor;

import javax.persistence.*;

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

}