package br.com.potential.hotel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "guest")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GuestEntity {

    @Id
    private String documentNumber; // pode ser CPF ou passaporte

    @Column(nullable = false)
    private String fullName;

    @Column
    private String email;

    @ManyToOne
    @JoinColumn(name = "reservation_id", nullable = false)
    private ReservationEntity reservation;
}
