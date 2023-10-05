package main.java.com.komal.airlineSab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.komal.airlineSab.entity.Checkin;
import main.java.com.komal.airlineSab.entity.Passenger;
import main.java.com.komal.airlineSab.service.PassengerService;

@RestController
public class CheckinRestController {
	
	@Autowired
	private PassengerService passengerService;
	
	
	@PostMapping("/checkin")
	public Passenger checkinFormSubmit(@RequestBody Passenger passenger) {
		Passenger passengerFromDB= passengerService.findById(passenger.getPassengerId());
		Checkin checkinFromDB = passengerFromDB.getCheckIn();
		checkinFromDB.setSeatNumber(passenger.getCheckIn().getSeatNumber());
		checkinFromDB.setGateNumber("Gate3");
		passengerFromDB.setCheckIn(checkinFromDB);
		passengerService.save(passengerFromDB);
		return passengerFromDB;
		
	}

}
