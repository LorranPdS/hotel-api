package br.com.potential.hotel.entity;

import java.time.LocalDateTime;
import java.util.UUID;

public class FeedbackEntity {

    private UUID id;
    private GuestEntity guestEntity;
    private RoomEntity roomEntity;
    private Integer rating;
    private String comment;
    private LocalDateTime createdAt;
}
