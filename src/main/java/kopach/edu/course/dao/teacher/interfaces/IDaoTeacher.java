package kopach.edu.course.dao.teacher.interfaces;
/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
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
