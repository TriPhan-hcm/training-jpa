package com.faber.airmgr.data.repositories;

import com.faber.airmgr.data.entities.FlightEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface FlightRepository extends JpaRepository<FlightEntity, Long> {

    @Query("SELECT f FROM flight f WHERE f.departurePort.id = :fromPort AND f.arrivalPort.id = :toPort AND day(f.departureTime) = day(:departureDate) AND day(f.arrivalTime) = day(:arrivalDate)")
    Page<FlightEntity> filter(Long fromPort, Long toPort, Date departureDate, Date arrivalDate, Pageable page);
}
