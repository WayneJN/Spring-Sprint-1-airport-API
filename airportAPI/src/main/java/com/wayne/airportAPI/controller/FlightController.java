package com.wayne.airportAPI.controller;

import com.wayne.airportAPI.model.Flight;
import com.wayne.airportAPI.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/flights")
@CrossOrigin
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }

    @PostMapping
    public Flight createFlight(@Valid @RequestBody Flight flight) {
        return flightService.createFlight(flight);
    }

    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable Long id) {
        flightService.deleteFlight(id);
    }

    @GetMapping(params = {"origin", "destination"})
    public List<Flight> getFlightsBetweenAirports(
            @RequestParam Long origin,
            @RequestParam Long destination) {
        return flightService.getFlightsBetweenAirports(origin, destination);
    }
}
