package com.godev.chatroom.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "accounts")
public class Account extends AbstractAuditableEntity<Account, Long> {
    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String password;
}
