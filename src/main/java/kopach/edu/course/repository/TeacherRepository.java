package kopach.edu.course.repository;

/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 */

import kopach.edu.course.model.Group;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import kopach.edu.course.model.Teacher;

import java.util.List;

@Repository
public interface TeacherRepository extends MongoRepository<Teacher, String> {

}
