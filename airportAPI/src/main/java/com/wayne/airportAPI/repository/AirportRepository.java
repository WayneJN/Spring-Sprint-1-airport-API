package com.wayne.airportAPI.repository;

import com.wayne.airportAPI.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Long> {
}
