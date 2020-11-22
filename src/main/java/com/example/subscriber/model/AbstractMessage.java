package com.example.subscriber.model;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@ToString
@MappedSuperclass
@Access(AccessType.FIELD)
@EqualsAndHashCode
@Data
public abstract class AbstractMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "msisdn", nullable = false)
    private long msisdn;

    @NotNull
    @Column(name = "timestamp", nullable = false)
    private long timestamp;
}
