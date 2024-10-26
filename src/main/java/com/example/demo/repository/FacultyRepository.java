package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Faculty;

public interface FacultyRepository extends MongoRepository<Faculty, Integer> {

}
