package com.mongodb.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.api.model.User;

public interface UserRepository extends MongoRepository<User, String> {

}
