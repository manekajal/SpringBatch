package com.ebridgelabz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ebridgelabz.model.User;

public interface UserRepo extends JpaRepository<User,Integer> {

}
