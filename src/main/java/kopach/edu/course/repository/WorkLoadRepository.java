package kopach.edu.course.repository;/*
 @author Vladyslav Zaichenko
 @since 09 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import kopach.edu.course.model.WorkLoad;

@Repository
public interface WorkLoadRepository extends MongoRepository<WorkLoad, String> {
}
