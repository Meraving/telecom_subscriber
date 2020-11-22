package com.example.subscriber.service;

import com.example.subscriber.dto.MessageDTO;
import com.example.subscriber.model.SubscriptionMessage;

public interface SubscriptionMessageService {
    void create (MessageDTO messageDTO);
}
