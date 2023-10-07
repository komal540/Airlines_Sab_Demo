package main.java.com.komal.airlineSab.dao;

import main.java.com.komal.airlineSab.entity.AirlineInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineInfoDao extends JpaRepository<AirlineInfo, Long>{
	
	AirlineInfo findByNameOfAirline(String name);

}
