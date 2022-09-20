package potato.admin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import potato.admin.domain.message.HallCreateRequest;
import potato.admin.repository.HallRepository;

@RestController
@RequiredArgsConstructor
public class HallAdminController {
    private final HallRepository hallRepository;

    @PostMapping("/hall")
    public String createHall(@RequestBody HallCreateRequest hallCreateRequest) {
        hallRepository.save(hallCreateRequest.toEntity());
        return "spring-boot start";
    }

}
