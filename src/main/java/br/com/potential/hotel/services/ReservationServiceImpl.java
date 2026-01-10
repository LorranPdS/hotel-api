package br.com.potential.hotel.services;

import br.com.potential.hotel.entity.ReservationEntity;
import br.com.potential.hotel.interfaces.ReservationService;
import br.com.potential.hotel.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.UUID;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository repository;

    @Override
    public ReservationEntity findByIdEntity(UUID reservationId) {
        return repository.findById(reservationId)
                .orElseThrow(() -> new NoSuchElementException("Reservation" + reservationId + " not found"));
    }

}
