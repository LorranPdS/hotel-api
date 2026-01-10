package br.com.potential.hotel.services;

import br.com.potential.hotel.dto.requests.ExtraChargesRequest;
import br.com.potential.hotel.dto.responses.ExtraChargesResponse;
import br.com.potential.hotel.entity.ExtraChargesEntity;
import br.com.potential.hotel.interfaces.ExtraChargesService;
import br.com.potential.hotel.interfaces.ReservationService;
import br.com.potential.hotel.repositories.ExtraChargesRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ExtraChargesServiceImpl implements ExtraChargesService {

    @Autowired
    private ExtraChargesRepository repository;

    @Autowired
    private ReservationService reservationService;

    @Override
    public ExtraChargesResponse save(ExtraChargesRequest extraChargesRequest) {
    // sempre lembrar de criar validations (ver se campos foram preenchidos e tal) e lançar as exceptions
        var reservationEntity = reservationService.findByIdEntity(extraChargesRequest.getReservationId());
        var extraChargesEntity = repository.save(ExtraChargesEntity.of(extraChargesRequest, reservationEntity));
        log.info("Extracharge {} saved with sucessfull", extraChargesEntity.getDescription());

        return ExtraChargesResponse.of(extraChargesEntity);
    }

    // PARA HOJE: implementar uma busca mas usando o QueryDSL para eu aprender como que faz isso

}
