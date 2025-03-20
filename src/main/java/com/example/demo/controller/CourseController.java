package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CourseService;

import io.swagger.v3.oas.annotations.Operation;

import com.example.demo.dto.CourseDto;
import com.example.demo.model.Course;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import jdk.jfr.Registered;

import org.springframework.http.HttpStatus;



@RequestMapping("/courses")
@RestController
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @GetMapping("/getCourses")
    public List<Course> getCourses() {
        return courseService.getAll();
    }

    @GetMapping("/getCourse")
    public Course getCourse(int id) {
        return courseService.getById(id);
    }
    
    @Operation(summary = "Save Course", description = "Save Course")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/saveCourse")
    public Course saveCourse(Course course) {
        return courseService.save(course);
    }

    // @PatchMapping("/deleteCourse")
    // public void deleteCourse(Course course) {
    //     courseService.delete(course);
    // }

    @DeleteMapping("/deleteCourse/{id}")
    public void deleteCourse(@PathVariable("id") int id) {
        courseService.delete(id);
    }


    // @PutMapping("/updateCourse")
    // public void updateCourse(@RequestBody Course course) {
    //     courseService.update(course);
    // }   



}
