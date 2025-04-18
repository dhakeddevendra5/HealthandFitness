package com.example.demo.habit.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Goal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private int targetValue;
    private int currentProgress;

    @ManyToOne
    private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTargetValue() {
		return targetValue;
	}

	public void setTargetValue(int targetValue) {
		this.targetValue = targetValue;
	}

	public int getCurrentProgress() {
		return currentProgress;
	}

	public void setCurrentProgress(int currentProgress) {
		this.currentProgress = currentProgress;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

    
}
