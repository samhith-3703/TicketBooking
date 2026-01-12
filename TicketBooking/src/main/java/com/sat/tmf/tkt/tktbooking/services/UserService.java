package com.sat.tmf.tkt.tktbooking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sat.tmf.tkt.tktbooking.dto.CreateUserDTO;
import com.sat.tmf.tkt.tktbooking.entity.User;
import com.sat.tmf.tkt.tktbooking.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;

	public User registerNewUser(CreateUserDTO user) {
		User userEntity = new User();
		userEntity.setFirstName(user.getFirstName());
		userEntity.setLastName(user.getLastName());
		userEntity.setEmail(user.getEmail());
		userEntity.setPhNo(user.getPhNo());
		userEntity.setPassword(user.getPassword());
		
		userRepo.save(userEntity);
		return userRepo.save(userEntity);
	}
}
