package potato.admin.domain.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class HallUpdateRequest {
    String hallName;
    String zip;
    String address1;
    String address2;
    String phoneNumber;
    String homepage;
}
