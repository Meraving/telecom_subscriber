package com.example.subscriber.service;

import com.example.subscriber.dto.MessageDTO;
import com.example.subscriber.model.PurchaseMessage;

public interface PurchaseMessageService {
    void create (MessageDTO messageDTO);
}
