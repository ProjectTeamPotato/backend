package potato.admin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import potato.admin.domain.message.*;
import potato.admin.service.HallAdminService;

@RestController
@RequiredArgsConstructor
public class HallAdminController {
    private final HallAdminService hallAdminService;

    @PostMapping("/hall")
    public String createHall(@Validated @RequestBody HallCreateRequest hallCreateRequest) {
        hallAdminService.create(hallCreateRequest);
        return "hall create test";
    }

    @PutMapping("/hall/{hall_id}")
    public String updateHall(@PathVariable("hall_id") Long hallId, @RequestBody HallUpdateRequest hallUpdateRequest) {
        hallAdminService.update(hallId, hallUpdateRequest);
        return "hall update test";
    }

    @GetMapping("/hall/{hall_id}")
    public HallGetResponse getHall(@PathVariable("hall_id") Long hallId) {
        return HallGetResponse.of(hallAdminService.getHall(hallId));
    }

}
