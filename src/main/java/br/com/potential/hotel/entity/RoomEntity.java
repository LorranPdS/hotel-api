package br.com.potential.hotel.entity;

import br.com.potential.hotel.enumeration.EnumStatusRoom;
import br.com.potential.hotel.enumeration.EnumTypeRoom;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "room")
public class RoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EnumTypeRoom type;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EnumStatusRoom status;

    @Column(nullable = false)
    private BigDecimal pricePerNight;

    @Column
    private Integer qtdBedsAvailable;

    @Column
    private String description;

    @OneToMany(mappedBy = "room")
    private List<ReservationEntity> reservations;
}
