package com.example.subscriber.repository;

import com.example.subscriber.model.PurchaseMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseMessageRepository extends JpaRepository<PurchaseMessage, Long> {

}
