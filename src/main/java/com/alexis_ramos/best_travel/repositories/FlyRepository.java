package com.alexis_ramos.best_travel.repositories;

import com.alexis_ramos.best_travel.domain.entities.FlyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface FlyRepository extends JpaRepository<FlyEntity, Long> {

    @Query("select f from fly f where f.price < :price")
    List<FlyEntity> selectLessPrice(BigDecimal price);

    @Query("select f from fly f where f.price between :min and :max")
    List<FlyEntity> selectBetweenPrice(BigDecimal min, BigDecimal max);

    @Query("select f from fly f where f.originName = :origin and f.destinyName = :destiny")
    List<FlyEntity> selectOriginDestiny(String origin, String destiny);

}
