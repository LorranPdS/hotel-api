package br.com.potential.hotel.dto.requests;

import br.com.potential.hotel.entity.ReservationEntity;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ExtraChargesRequest {

    private String description;
    private BigDecimal amount;
    private ReservationEntity reservation;
}
