package kopach.edu.course.service.teacher.interfaces;
/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 */

import kopach.edu.course.model.Teacher;

import java.util.List;

public interface ITeacherService {

    Teacher create (Teacher teacher);
    Teacher get(String id);
    Teacher delete (String id);
    Teacher update (Teacher teacher);
    List<Teacher> getAll();

//    List<Teacher> searchByName(String str);
//    List<Teacher> searchByString(String str);
//    List<Teacher> sortByName(String name, String order);

}
