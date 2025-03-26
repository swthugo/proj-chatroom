package com.godev.chatroom.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serial;
import java.io.Serializable;

@MappedSuperclass
public abstract class AbstractPersistentEntity<ID> implements Serializable {
    @Serial
    private static final long serialVersionUID = -3287715633608041039L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected ID id;

//    @Version
//    protected Long version;
}
