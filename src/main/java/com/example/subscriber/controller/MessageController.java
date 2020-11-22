package com.example.subscriber.controller;

import com.example.subscriber.dto.MessageDTO;
import com.example.subscriber.model.Action;
import com.example.subscriber.service.PurchaseMessageService;
import com.example.subscriber.service.SubscriptionMessageService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RequiredArgsConstructor
@RestController
@RequestMapping("/rest")
public class MessageController {

    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

    private final PurchaseMessageService purchaseMessageService;
    private final SubscriptionMessageService subscriptionMessageService;

    @PostMapping("/message")
    public void createMessage(@RequestBody @Valid MessageDTO messageDTO) {

        logger.info("Got message "+ messageDTO);

        if (Action.valueOf(messageDTO.getAction()) == Action.PURCHASE) {
            purchaseMessageService.create(messageDTO);
            return;
        }
        if (Action.valueOf(messageDTO.getAction()) == Action.SUBSCRIPTION) {
            subscriptionMessageService.create(messageDTO);
            return;
        }
        logger.warn("Got message with invalid action: "+ messageDTO.getAction());
    }
}
