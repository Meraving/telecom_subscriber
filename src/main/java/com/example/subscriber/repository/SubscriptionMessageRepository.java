package com.example.subscriber.repository;

import com.example.subscriber.model.SubscriptionMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionMessageRepository extends JpaRepository<SubscriptionMessage, Long> {
}
