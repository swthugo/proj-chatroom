package com.godev.chatroom.model;

import jakarta.persistence.*;

import java.io.Serializable;

@MappedSuperclass
public abstract class AbstractPersistentEntity<ID> implements Serializable {
    private static final long serialVersionUID = -3287715633608041039L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected ID id;

    @Version
    protected Long version;
}
