package com.potato.reservation.repository;

import com.potato.reservation.config.DataSourceConfig;
import com.potato.reservation.constant.PayStatus;
import com.potato.reservation.model.entity.Ask;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

@ExtendWith(SpringExtension.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
class AskRepositoryTest {

    @Autowired
    private AskRepository askRepository;


    @Test
    void save() {

        // given
        Ask ask = Ask.builder()
                .payId(123L)
                .userId(123L)
                .payStatus(PayStatus.SUCCESS)
                .basketUuid(UUID.randomUUID())
                .build();

        // when
        final Ask saveAsk = askRepository.save(ask);

        // then
        assertEquals(123L, saveAsk.getPayId());
    }

}
