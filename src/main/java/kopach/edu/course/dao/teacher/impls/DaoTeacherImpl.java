package kopach.edu.course.dao.teacher.impls;/*
 @author Vladyslav Zaichenko
 @since 09 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import kopach.edu.course.datastorage.DataFake;
import kopach.edu.course.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kopach.edu.course.dao.teacher.interfaces.IDaoTeacher;

import java.util.List;

@Repository
public class DaoTeacherImpl implements IDaoTeacher {

    @Autowired
    DataFake dataFake;

    @Override
    public Teacher create(Teacher teacher) {
        return null;
    }

    @Override
    public Teacher get(String id) {
        return null;
    }

    @Override
    public Teacher delete(String id) {
        return null;
    }

    @Override
    public Teacher update(Teacher teacher) {
        return null;
    }

    @Override
    public List<Teacher> getAll() {
        return null;
    }
}
