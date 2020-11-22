package com.example.subscriber.dto;

import com.example.subscriber.model.Action;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MessageDTO {

    @NotNull
    private long msisdn;

    @NotBlank
    private String action;

    @NotNull
    private long timestamp;

}
