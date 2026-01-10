package br.com.potential.hotel.interfaces;

import br.com.potential.hotel.entity.ReservationEntity;

import java.util.UUID;

public interface ReservationService {

    ReservationEntity findByIdEntity(UUID reservationId);

}
