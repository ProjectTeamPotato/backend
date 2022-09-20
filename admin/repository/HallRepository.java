package potato.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import potato.admin.domain.entity.Hall;

@Repository
public interface HallRepository extends JpaRepository<Hall,Long> {
    @Modifying
    @Query("UPDATE interpark.hall" +
            "SET address1 = 'kwangjin-gu', " +
            "hall_name = 'yes24 live hall', " +
            "homepage = 'https://yes24livehall.com/', " +
            "phone_number = '070-5001-4532', " +
            "zip = '04970' " +
            "WHERE hall_id = 1 ")
    int updateHallInfo(String address1, String address2, String hallName, String homepage, Long phone_number, String zip);
}
