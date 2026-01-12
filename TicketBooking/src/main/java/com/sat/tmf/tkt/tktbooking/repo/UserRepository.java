package com.sat.tmf.tkt.tktbooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sat.tmf.tkt.tktbooking.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
