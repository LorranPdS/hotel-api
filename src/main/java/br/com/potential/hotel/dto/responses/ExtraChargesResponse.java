package br.com.potential.hotel.dto.responses;

import br.com.potential.hotel.entity.ExtraChargesEntity;
import br.com.potential.hotel.entity.ReservationEntity;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.util.UUID;

@Data
@Builder
public class ExtraChargesResponse {

    private UUID id;
    private String description;
    private BigDecimal amount;
    private UUID reservationId;

    public static ExtraChargesResponse of(ExtraChargesEntity extraChargesEntity){
        return ExtraChargesResponse.builder()
                .id(extraChargesEntity.getId())
                .description(extraChargesEntity.getDescription())
                .amount(extraChargesEntity.getAmount())
                .reservationId(extraChargesEntity.getReservation().getId())
                .build();
    }
}
