package main.java.com.komal.airlineSab.dao;

import main.java.com.komal.airlineSab.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
	
	User findByUserName(String userName);

}
