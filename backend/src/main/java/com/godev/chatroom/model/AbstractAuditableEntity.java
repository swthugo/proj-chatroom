package com.godev.chatroom.model;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractAuditableEntity<T, ID> extends AbstractPersistentEntity<ID> {
    @CreatedDate
    protected LocalDateTime createdAt;

    @LastModifiedBy
    protected LocalDateTime updatedAt;
}
