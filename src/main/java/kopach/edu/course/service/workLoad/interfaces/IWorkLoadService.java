package kopach.edu.course.service.workLoad.interfaces;/*
 @author Vladyslav Zaichenko
 @since 09 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
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
}
