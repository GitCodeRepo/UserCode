package com.mongodb.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.api.model.Course;
import com.mongodb.api.service.CourseService;

@RestController
@RequestMapping("/api")
public class CourseContoller {
	@Autowired
	private CourseService courseService;

	@GetMapping("/getAllCourses")
	public List<Course> getCourses() {
		return courseService.getCourses();
	}

	@PostMapping("/addCourse")
	public Course createCourse(@RequestBody Course course) {
		return courseService.saveCourse(course);
	}
}
