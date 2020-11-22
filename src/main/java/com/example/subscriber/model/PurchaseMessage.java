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
@Table(name = "purchase")
public class PurchaseMessage extends AbstractMessage {

    public static PurchaseMessage of(MessageDTO messageDTO) {
        PurchaseMessage purchaseMessage = new PurchaseMessage();
        purchaseMessage.setMsisdn(messageDTO.getMsisdn());
        purchaseMessage.setTimestamp(messageDTO.getTimestamp());
        return purchaseMessage;
    }

}
