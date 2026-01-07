package br.com.potential.hotel.repositories;

import br.com.potential.hotel.entity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReservationRepository extends JpaRepository<ReservationEntity, UUID> {
}
