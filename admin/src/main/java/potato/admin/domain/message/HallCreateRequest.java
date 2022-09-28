package potato.admin.domain.message;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import potato.admin.domain.entity.Hall;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class HallCreateRequest {
    String hallName;
    String zip;
    String address1;
    String address2;
    String phoneNumber;
    String homepage;

    public Hall toEntity() {
        return new Hall(null, hallName, zip, address1, address2, phoneNumber, homepage);
    }
}






