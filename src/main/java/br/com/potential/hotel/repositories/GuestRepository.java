package br.com.potential.hotel.repositories;

import br.com.potential.hotel.entity.GuestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<GuestEntity, String> {
}
