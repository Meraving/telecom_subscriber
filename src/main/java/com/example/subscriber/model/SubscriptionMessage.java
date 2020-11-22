package com.example.subscriber.model;

import com.example.subscriber.dto.MessageDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
@Table(name = "subscription")
public class SubscriptionMessage extends AbstractMessage {

    public static SubscriptionMessage of(MessageDTO messageDTO) {
        SubscriptionMessage subscriptionMessage = new SubscriptionMessage();
        subscriptionMessage.setMsisdn(messageDTO.getMsisdn());
        subscriptionMessage.setTimestamp(messageDTO.getTimestamp());
        return subscriptionMessage;
    }

}
