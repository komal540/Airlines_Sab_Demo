package main.java.com.komal.airlineSab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.komal.airlineSab.dao.PassengerDao;
import main.java.com.komal.airlineSab.entity.Passenger;

@Service
public class PassengerService {
	
	@Autowired
	private PassengerDao passengerDao;
	
	public List<Passenger> getAllPassengers() {
		return passengerDao.findAll();
	}
	
	
	public Passenger findById(Long id) {
		return passengerDao.findById(id).get();
	}
	
	public void saveAll(List<Passenger> passengers) {
		passengerDao.saveAll(passengers);
	}
	
	public void save(Passenger passenger) {
		passengerDao.save(passenger);
	}

}
