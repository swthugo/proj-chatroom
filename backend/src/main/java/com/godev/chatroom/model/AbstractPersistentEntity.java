package com.godev.chatroom.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractPersistentEntity<ID> implements Serializable {
    @Serial
    private static final long serialVersionUID = -3287715633608041039L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected ID id;

    @Version
    protected Long version;
}
