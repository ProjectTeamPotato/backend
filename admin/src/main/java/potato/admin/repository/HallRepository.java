package potato.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import potato.admin.domain.entity.Hall;

@Repository
public interface HallRepository extends JpaRepository<Hall,Long> {

}
