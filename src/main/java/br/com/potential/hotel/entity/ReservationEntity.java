package br.com.potential.hotel.entity;

import br.com.potential.hotel.enumeration.EnumStatusReservation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reservation")
public class ReservationEntity {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", updatable = false, nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private RoomEntity room;

    @Column(nullable = false)
    private LocalDateTime checkIn;

    @Column(nullable = false)
    private LocalDateTime checkOut;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EnumStatusReservation status; // e.g. CONFIRMED, CANCELED, NO_SHOW

    @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL)
    private List<GuestEntity> guests;

    @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL)
    private List<ExtraChargesEntity> extraCharges;
}
