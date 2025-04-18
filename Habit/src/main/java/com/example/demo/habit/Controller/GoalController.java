package com.example.demo.habit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.habit.Model.Goal;
import com.example.demo.habit.Repository.GoalRepository;

@RestController
@RequestMapping("/api/goals")
public class GoalController {

    @Autowired
    private GoalRepository goalRepository;

    @PostMapping
    public Goal setGoal(@RequestBody Goal goal) {
        return goalRepository.save(goal);
    }

    @GetMapping("/user/{userId}")
    public List<Goal> getGoals(@PathVariable Long userId) {
        return goalRepository.findByUserId(userId);
    }
}

