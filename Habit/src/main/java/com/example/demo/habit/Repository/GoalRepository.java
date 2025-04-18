package com.example.demo.habit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.habit.Model.Goal;

public interface GoalRepository extends JpaRepository<Goal, Long>{
	List<Goal> findByUserId(Long userId);
}
