package com.alexis_ramos.best_travel.repositories;

import com.alexis_ramos.best_travel.domain.entities.TourEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TourRepository extends JpaRepository<TourEntity, Long> {

}
