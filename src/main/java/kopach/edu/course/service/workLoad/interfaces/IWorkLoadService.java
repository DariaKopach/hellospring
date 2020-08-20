package kopach.edu.course.service.workLoad.interfaces;

/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 */

import kopach.edu.course.model.WorkLoad;

import java.util.List;

public interface IWorkLoadService {

    // crud
    WorkLoad create (WorkLoad workLoad);
    WorkLoad get(String id);
    WorkLoad delete (String id);
    WorkLoad update (WorkLoad workLoad);
    List<WorkLoad> getAll();

//    List<WorkLoad> searchByName(String str);
//    List<WorkLoad> searchByString(String str);
//    List<WorkLoad> sortByName(String name, String order);
}
