package com.example.demo.mapper;

import org.mapstruct.Mapper;

import com.example.demo.dto.CourseDto;
import com.example.demo.model.Course;


@Mapper(componentModel = "spring")
public interface CourseMapper {

    Course toCourse(CourseDto courseDto);
    CourseDto toCourseDto(Course course);

}
