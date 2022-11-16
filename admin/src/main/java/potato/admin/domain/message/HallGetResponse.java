package potato.admin.domain.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import potato.admin.domain.entity.Hall;

@Builder
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
        HallGetResponse hallGetResponse  = HallGetResponse.builder()
                .hallId(hall.getHallId())
                .hallName(hall.getHallName())
                .zip(hall.getZip())
                .address1(hall.getAddress1())
                .address2(hall.getAddress2())
                .phoneNumber(hall.getPhoneNumber())
                .homepage(hall.getHomepage())
                .build();

        return hallGetResponse;
    }

}
