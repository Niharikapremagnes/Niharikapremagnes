package com.example.passenger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.passenger.model.Passenger;
import com.example.passenger.repository.PassengerRepository;

@RestController
@RequestMapping("/api")
public class PassengerController {

	@Autowired
	private PassengerRepository passengerRepository;
	
	@GetMapping("/passengers")
	public List<Passenger> getAllPassengers(){
		return passengerRepository.findAll();
	}
	@PostMapping("/passenger")
	public Passenger newPassenger(@RequestBody Passenger passenger) {
		return passengerRepository.save(passenger);
	}
}
