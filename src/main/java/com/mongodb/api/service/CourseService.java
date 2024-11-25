package com.mongodb.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.api.model.Course;
import com.mongodb.api.repository.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getCourses() {
		return courseRepository.findAll();
	}

	public Course saveCourse(Course course) {
		return courseRepository.save(course);
	}
}
