package kopach.edu.course.service.group.interfaces;

/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 */

import kopach.edu.course.model.Group;
import kopach.edu.course.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IGroupService {

    // crud
    Group create (Group group);
    Group get(String id);
    Group delete (String id);
    Group update (Group group);
    List<Group> getAll();

}
