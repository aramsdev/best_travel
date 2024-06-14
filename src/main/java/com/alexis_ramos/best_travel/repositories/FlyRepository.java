package com.alexis_ramos.best_travel.repositories;

import com.alexis_ramos.best_travel.domain.entities.FlyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlyRepository extends JpaRepository<FlyEntity, Long> {

}
