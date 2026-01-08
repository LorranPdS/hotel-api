package br.com.potential.hotel.repositories;

import br.com.potential.hotel.entity.ExtraChargesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExtraChargesRepository extends JpaRepository<ExtraChargesEntity, UUID> {
}
