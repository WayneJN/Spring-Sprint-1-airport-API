package com.wayne.airportAPI.repository;

import com.wayne.airportAPI.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByOriginAirportIdAndDestinationAirportId(Long originId, Long destinationId);
}
