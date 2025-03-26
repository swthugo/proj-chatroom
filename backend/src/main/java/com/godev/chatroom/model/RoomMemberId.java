package com.godev.chatroom.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class RoomMemberId implements Serializable {
    @Serial
    private static final long serialVersionUID = -3287715633608041038L;

    private Long roomId;

    private Long accountId;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RoomMemberId that = (RoomMemberId) o;
        return Objects.equals(roomId, that.roomId) && Objects.equals(accountId, that.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roomId, accountId);
    }
}
