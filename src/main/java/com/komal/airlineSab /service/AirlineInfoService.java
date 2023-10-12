package main.java.com.komal.airlineSab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.komal.airlineSab.dao.AirlineInfoDao;
import main.java.com.komal.airlineSab.entity.AirlineInfo;

@Service
public class AirlineInfoService {
	
	@Autowired
	private AirlineInfoDao airlineInfoDao;
	

	public AirlineInfo findByNameOfAirline(String name) {
		return airlineInfoDao.findByNameOfAirline(name);
	}

}
