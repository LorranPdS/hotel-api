package br.com.potential.hotel.entity;

import br.com.potential.hotel.enumeration.EnumStatusReservation;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class ReservationEntity {

    @Id
    private Integer reservationId;
    private String guestName;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private Integer numberOfGuests;
    private EnumStatusReservation statusReservation;
    private BigDecimal totalAmount;
    private List<RoomEntity> rooms;

}
