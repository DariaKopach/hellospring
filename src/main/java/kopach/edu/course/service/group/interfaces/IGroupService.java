package kopach.edu.course.service.group.interfaces;/*
 @author Vladyslav Zaichenko
 @since 09 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import kopach.edu.course.model.Group;

import java.util.List;

public interface IGroupService {

    // crud
    Group create (Group group);
    Group get(String id);
    Group delete (String id);
    Group update (Group group);
    List<Group> getAll();
}
