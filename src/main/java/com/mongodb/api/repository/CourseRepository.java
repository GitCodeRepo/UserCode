package com.mongodb.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.api.model.Course;

public interface CourseRepository extends MongoRepository<Course, String> {

}
