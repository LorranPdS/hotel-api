package br.com.potential.hotel.entity;

import br.com.potential.hotel.dto.requests.ExtraChargesRequest;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "extracharges")
public class ExtraChargesEntity {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid", updatable = false, nullable = false)
    private UUID id;


    @Column(nullable = false)
    private String description; // exemplo: "Frigobar", "Estacionamento"

    @Column(nullable = false)
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "reservation_id", nullable = false)
    private ReservationEntity reservation;

    public static ExtraChargesEntity of(ExtraChargesRequest extraChargesRequest){
        var extraChargesEntity = new ExtraChargesEntity();
        BeanUtils.copyProperties(extraChargesRequest, extraChargesEntity);
        return extraChargesEntity;
    }
}
