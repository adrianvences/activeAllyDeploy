package com.project.activeally.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.activeally.models.Workout;

public interface WorkoutRepository extends CrudRepository <Workout, Long>{
    
    List<Workout> findAll();
}
