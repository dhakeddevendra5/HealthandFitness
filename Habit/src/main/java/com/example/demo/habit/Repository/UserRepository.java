package com.example.demo.habit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.habit.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
