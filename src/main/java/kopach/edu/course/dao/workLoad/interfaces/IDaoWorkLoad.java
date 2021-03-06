package kopach.edu.course.dao.workLoad.interfaces;
/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 Description:
 */

import kopach.edu.course.model.WorkLoad;

import java.util.List;

public interface IDaoWorkLoad {
    WorkLoad create(WorkLoad workLoad);
    WorkLoad get(String id);
    WorkLoad delete(String id);
    WorkLoad update(WorkLoad workLoad);
    List<WorkLoad> getAll();
}
