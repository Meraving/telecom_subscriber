package com.example.subscriber.service.impl;

import com.example.subscriber.dto.MessageDTO;
import com.example.subscriber.model.SubscriptionMessage;
import com.example.subscriber.repository.SubscriptionMessageRepository;
import com.example.subscriber.service.SubscriptionMessageService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class SubscriptionMessageServiceImpl implements SubscriptionMessageService {

    private final SubscriptionMessageRepository repository;

    private static final Logger logger = LoggerFactory.getLogger(SubscriptionMessageServiceImpl.class);

    @Override
    public void create(MessageDTO messageDTO) {
        SubscriptionMessage message = repository.save(SubscriptionMessage.of(messageDTO));
        logger.info("Wrote " + message);
    }
}
