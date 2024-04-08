package com.Origin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Origin.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
