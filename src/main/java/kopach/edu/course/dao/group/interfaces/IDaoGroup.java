package kopach.edu.course.dao.group.interfaces;
/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 Description:
 */

import kopach.edu.course.model.Group;

import java.util.List;

public interface IDaoGroup {
    Group create(Group group);
    Group get(String id);
    Group delete(String id);
    Group update(Group group);
    List<Group> getAll();
}
