package br.com.potential.hotel.entity;

import br.com.potential.hotel.enumeration.EnumStatusRoom;
import br.com.potential.hotel.enumeration.EnumTypeRoom;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class RoomEntity {

    @Id
    private Integer roomNumber;

    private EnumStatusRoom status;
    private BigDecimal pricePerNight;
    private BigDecimal totalAmount;
    private List<ExtraChargesEntity> extraCharges;
    private String description;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private EnumTypeRoom type;
    private List<GuestEntity> guests;
}
