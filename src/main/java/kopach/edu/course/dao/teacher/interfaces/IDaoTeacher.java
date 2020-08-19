package kopach.edu.course.dao.teacher.interfaces;/*
 @author Vladyslav Zaichenko
 @since 08 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import kopach.edu.course.model.Teacher;

import java.util.List;

public interface IDaoTeacher {
    Teacher create(Teacher teacher);
    Teacher get(String id);
    Teacher delete(String id);
    Teacher update(Teacher teacher);
    List<Teacher> getAll();
}
