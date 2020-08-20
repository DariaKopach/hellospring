package kopach.edu.course.service.teacher.impls;

/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 */

import kopach.edu.course.datastorage.DataFake;
import kopach.edu.course.repository.TeacherRepository;
import kopach.edu.course.service.teacher.interfaces.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kopach.edu.course.model.Teacher;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    DataFake dataFake;

    @Override
    public Teacher create(Teacher teacher) {
        teacher.setCreatedAt(LocalDateTime.now());
        teacher.setUpdateAt(LocalDateTime.now());
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher get(String id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @Override
    public Teacher delete(String id) {
        Teacher teacher = this.get(id);
        teacherRepository.deleteById(teacher.getId());
        return teacher;
    }

    @Override
    public Teacher update(Teacher teacher) {
        teacher.setUpdateAt(LocalDateTime.now());
        return teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }


    public void reloadDataBase()
    {
        dataFake.init();
    }

}
