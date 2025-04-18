package com.example.demo.habit.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.habit.Model.Workout;

public interface WorkoutRepository extends JpaRepository<Workout, Long> {
	List<Workout> findByUserId(Long userId);
}
