package kopach.edu.course.service.workLoad.impls;

/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 */

import kopach.edu.course.datastorage.DataFake;
import kopach.edu.course.repository.WorkLoadRepository;
import kopach.edu.course.service.workLoad.interfaces.IWorkLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kopach.edu.course.model.WorkLoad;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class WorkLoadServiceImpl implements IWorkLoadService {

    @Autowired
    WorkLoadRepository workLoadRepository;

    @Autowired
    DataFake dataFake;

    @Override
    public WorkLoad create(WorkLoad workLoad) {
        workLoad.setCreatedAt(LocalDateTime.now());
        workLoad.setUpdateAt(LocalDateTime.now());
        return workLoadRepository.save(workLoad);
    }

    @Override
    public WorkLoad get(String id) {
        return workLoadRepository.findById(id).orElse(null);
    }

    @Override
    public WorkLoad delete(String id) {
        WorkLoad workLoad = this.get(id);
        workLoadRepository.deleteById(workLoad.getId());
        return workLoad;
    }

    @Override
    public WorkLoad update(WorkLoad workLoad) {
        workLoad.setUpdateAt(LocalDateTime.now());
        return workLoadRepository.save(workLoad);
    }

    @Override
    public List<WorkLoad> getAll() {
        return workLoadRepository.findAll();
    }

//    @Override
//    public List<WorkLoad> searchByName(String str) {
//        return null;
//    }
//
//    @Override
//    public List<WorkLoad> searchByString(String str) {
//        return null;
//    }
//
//    @Override
//    public List<WorkLoad> sortByName(String name, String order) {
//        return null;
//    }

    public void reloadDataBase()
    {
        dataFake.init();
    }
}
