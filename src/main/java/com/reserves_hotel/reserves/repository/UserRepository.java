package com.reserves_hotel.reserves.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reserves_hotel.reserves.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
 
}
