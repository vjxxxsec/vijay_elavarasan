package com.demo.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Users;

@Repository
public interface myrepo1 extends JpaRepository<Users, Integer> {
	
	Users findByEmail(String email);

}
