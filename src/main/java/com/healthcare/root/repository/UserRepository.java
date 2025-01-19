package com.healthcare.root.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthcare.root.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
