package com.alexis_ramos.best_travel.repositories;

import com.alexis_ramos.best_travel.domain.entities.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository <HotelEntity, Long> {
}
