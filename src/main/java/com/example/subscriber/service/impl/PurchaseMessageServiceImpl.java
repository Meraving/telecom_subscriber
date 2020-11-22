package com.example.subscriber.service.impl;

import com.example.subscriber.controller.MessageController;
import com.example.subscriber.dto.MessageDTO;
import com.example.subscriber.model.PurchaseMessage;
import com.example.subscriber.repository.PurchaseMessageRepository;
import com.example.subscriber.service.PurchaseMessageService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PurchaseMessageServiceImpl implements PurchaseMessageService {

    private final PurchaseMessageRepository repository;

    private static final Logger logger = LoggerFactory.getLogger(PurchaseMessageServiceImpl.class);

    @Override
    public void create(MessageDTO messageDTO) {
       PurchaseMessage message = repository.save(PurchaseMessage.of(messageDTO));
        logger.info("Wrote " + message);
    }
}
