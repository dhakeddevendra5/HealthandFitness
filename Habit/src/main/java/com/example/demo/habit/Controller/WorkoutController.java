package com.example.demo.habit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.habit.Model.Workout;
import com.example.demo.habit.Repository.WorkoutRepository;

@RestController
@RequestMapping("/api/workouts")
public class WorkoutController {

    @Autowired
    private WorkoutRepository workoutRepository;

    @PostMapping
    public Workout logWorkout(@RequestBody Workout workout) {
        return workoutRepository.save(workout);
    }

    @GetMapping("/user/{userId}")
    public List<Workout> getWorkouts(@PathVariable Long userId) {
        return workoutRepository.findByUserId(userId);
    }
}
