package potato.admin.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "seller")
@AllArgsConstructor
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    //userId;
    //licenseNumber
    String sellerNumber;
    String corporateName;
    String sellerZip;
    String SellerAddress1;
    String SellerAddress2;
    String SellerName;
    String ChiefName;
    String mail;
    String businessNumber;

}
