package br.com.potential.hotel.repositories;

import br.com.potential.hotel.entity.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<RoomEntity, Integer> {
}
