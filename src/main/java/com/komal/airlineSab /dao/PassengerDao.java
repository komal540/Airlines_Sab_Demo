package main.java.com.komal.airlineSab.dao;

import main.java.com.komal.airlineSab.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerDao extends JpaRepository<Passenger, Long> {

}
