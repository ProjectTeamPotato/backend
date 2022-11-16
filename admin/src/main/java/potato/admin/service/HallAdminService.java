package potato.admin.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import potato.admin.domain.entity.Hall;
import potato.admin.domain.entity.Product;
import potato.admin.domain.message.HallCreateRequest;
import potato.admin.domain.message.HallUpdateRequest;
import potato.admin.repository.HallRepository;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class HallAdminService {
    private final HallRepository hallRepository;

    public void create(HallCreateRequest hallCreateRequest) {
        hallRepository.save(hallCreateRequest.toEntity());
        //추가: 생성 성공 or 실패 정보 return
    }
    @Transactional
    public void update(Long hallId, HallUpdateRequest hallUpdateRequest) {
        Hall hall = hallRepository.findById(hallId).orElseThrow();
        hall.update(hallUpdateRequest);
    }

    public Hall getHall(Long hallId) {
        return hallRepository.findById(hallId).orElseThrow();
    }
}
