package kr.magicbox.payment.adapter.out.persistence.repository;

import kr.magicbox.payment.adapter.out.persistence.entity.PaymentInboxEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentInboxJpaRepository extends JpaRepository<PaymentInboxEntity, Long> {
    boolean existsByKey(String key);
    Optional<PaymentInboxEntity> findByTopicAndPartitionAndOffset(String topic, Integer partition, Long offset);
}
