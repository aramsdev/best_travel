package com.alexis_ramos.best_travel.repositories;

import com.alexis_ramos.best_travel.domain.entities.TicketEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TicketRepository extends CrudRepository<TicketEntity, UUID> {


}
