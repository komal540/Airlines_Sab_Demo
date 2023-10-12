package main.java.com.komal.airlineSab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.com.komal.airlineSab.dao.UserDao;
import main.java.com.komal.airlineSab.entity.User;

@Service
public class UserService {	
	
	@Autowired
	UserDao userDao;
	
	public void registerForm(User user) {
		userDao.save(user);
	}
	
	
	public User findByUserName(String userName){
		return userDao.findByUserName(userName);
	}

}
