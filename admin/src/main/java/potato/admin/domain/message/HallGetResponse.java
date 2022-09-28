package potato.admin.domain.message;


import lombok.AllArgsConstructor;
import potato.admin.domain.entity.Hall;
import potato.admin.domain.entity.ProductRound;
import potato.admin.domain.entity.Seller;

import java.util.List;

@AllArgsConstructor
public class HallGetResponse {
    Long hallId;
    String hallName;
    String zip;
    String address1;
    String address2;
    String phoneNumber;
    String homepage;

    static public HallGetResponse of(Hall hall) {
        return new HallGetResponse(hall.getHallId(), hall.getHallName(), hall.getZip(), hall.getAddress1(),
                                    hall.getAddress2(),hall.getPhoneNumber(), hall.getHomepage());
    }
}
