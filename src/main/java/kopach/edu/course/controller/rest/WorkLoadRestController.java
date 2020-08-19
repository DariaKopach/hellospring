package kopach.edu.course.controller.rest;/*
 @author Vladyslav Zaichenko
 @since 09 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import kopach.edu.course.model.WorkLoad;
import kopach.edu.course.service.workLoad.impls.WorkLoadServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/workLoad")
public class WorkLoadRestController {

    @Autowired
    WorkLoadServiceImpl workLoadService;

    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello, from Work Load Controller</h1>";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    List<WorkLoad> getWorkLoadList(){
        return workLoadService.getAll();
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    WorkLoad getWorkLoad(@PathVariable("id") String id){
        return workLoadService.get(id);
    }

}