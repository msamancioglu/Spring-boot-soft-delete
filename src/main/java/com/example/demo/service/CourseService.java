package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.repo.CourseRepository;

import lombok.RequiredArgsConstructor;



@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    public Course save(Course course) {        
        return courseRepository.save(course);
    }
    public void delete(int id) {
        courseRepository.findById(id).orElseThrow(
            () -> new IllegalArgumentException("Invalid course Id:" + id)            
        );
        courseRepository.deleteById(id);
    }
    public void update(Course course) {
        courseRepository.save(course);
    }
    public List<Course> getAll() {
        return courseRepository.findAll();
    }
    public Course getById(int id) {
        return courseRepository.findById(id).orElseThrow(
            () -> new IllegalArgumentException("Invalid course Id:" + id)            
        );
        
    }

}
