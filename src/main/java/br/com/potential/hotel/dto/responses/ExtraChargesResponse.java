package br.com.potential.hotel.dto.responses;

import br.com.potential.hotel.entity.ExtraChargesEntity;
import br.com.potential.hotel.entity.ReservationEntity;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.util.UUID;

@Data
public class ExtraChargesResponse {

    private UUID id;
    private String description;
    private BigDecimal amount;
    private ReservationEntity reservation;

    public static ExtraChargesResponse of(ExtraChargesEntity extraChargesEntity){
        var extraChargesResponse = new ExtraChargesResponse();
        BeanUtils.copyProperties(extraChargesEntity, extraChargesResponse);
        return extraChargesResponse;
    }
}
