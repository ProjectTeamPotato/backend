package potato.admin.domain.message;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import potato.admin.domain.entity.Hall;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.PositiveOrZero;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class HallCreateRequest {
    @NotBlank(message="NAME_IS_MANDATORY")
    String hallName;
    String address1;
    String address2;
    @Pattern(regexp = "[0-9]+-[0-9]+-[0-9]]")
    String phoneNumber;
    String homepage;
    @PositiveOrZero
    String zip;

    public Hall toEntity() {
        return Hall.builder()
                .hallName(hallName)
                .address1(address1)
                .address2(address2)
                .phoneNumber(phoneNumber)
                .homepage(homepage)
                .zip(zip)
                .build();
    }
}






