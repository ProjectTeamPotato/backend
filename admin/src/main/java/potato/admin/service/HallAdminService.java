package potato.admin.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import potato.admin.domain.entity.Hall;
import potato.admin.domain.message.HallCreateRequest;
import potato.admin.domain.message.HallUpdateRequest;
import potato.admin.repository.HallRepository;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HallAdminService {
    private final HallRepository hallRepository;

    public void create(HallCreateRequest hallCreateRequest) {
        Hall hall = hallRepository.save(hallCreateRequest.toEntity());
    }
    @Transactional
    public void update(Long hallId, HallUpdateRequest hallUpdateRequest) {
        Optional<Hall> hall = hallRepository.findById(hallId);

        if (hall.isEmpty()) {
            throw new RuntimeException();
        }

        hall.get().update(hallUpdateRequest);
    }

    public Hall getHall(Long hallId) {
        return hallRepository.findById(hallId).orElseThrow();
    }
}
