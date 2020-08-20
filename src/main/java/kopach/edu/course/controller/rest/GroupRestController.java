package kopach.edu.course.controller.rest;
/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 Description:
 */

import kopach.edu.course.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import kopach.edu.course.model.Group;
import kopach.edu.course.service.group.impls.GroupServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/group")
public class GroupRestController {

    @Autowired
    GroupServiceImpl groupService;

    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello, from Group Controller</h1>";
    }

    @RequestMapping(value = "get/list",method = RequestMethod.GET)
    List<Group> getGroupList(){
        return groupService.getAll();
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    Group getGroup(@PathVariable("id") String id){
        return groupService.get(id);}

        @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
        Group deleteGroup(@PathVariable("id") String id){
            return groupService.delete(id);
        }

        @RequestMapping(value = "/create", method = RequestMethod.POST)
        Group createGroup(@RequestBody Group group){
            return groupService.create(group);
        }


    }