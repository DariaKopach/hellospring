package kopach.edu.course.controller.web;/*
 @author Vladyslav Zaichenko
 @since 09 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import kopach.edu.course.form.TeacherForm;
import kopach.edu.course.form.WorkLoadForm;
import kopach.edu.course.model.Group;
import kopach.edu.course.model.Teacher;
import kopach.edu.course.model.WorkLoad;
import kopach.edu.course.service.group.impls.GroupServiceImpl;
import kopach.edu.course.service.group.interfaces.IGroupService;
import kopach.edu.course.service.teacher.impls.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import kopach.edu.course.service.workLoad.impls.WorkLoadServiceImpl;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/web/workLoad")
public class WorkLoadWebController {

    @Autowired
    WorkLoadServiceImpl workLoadService;

    @Autowired
    TeacherServiceImpl teacherService;

    @Autowired
    GroupServiceImpl groupService;


    Map<String, String> movs, mavs;

    @PostConstruct
    void init(){

        movs = new HashMap<>();
        mavs = new HashMap<>();

    }


    @RequestMapping("/get/list")
    String showAll(Model model){
        model.addAttribute("list",workLoadService.getAll());
        return "workLoadList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteWorkLoad(@PathVariable("id") String id, Model model) {
        workLoadService.delete(id);
        model.addAttribute("list", workLoadService.getAll());
        return "redirect:/web/workLoad/get/list";
    }

    @RequestMapping(value = "/reloadDB", method = RequestMethod.GET)
    String reloadDataBase() {
        workLoadService.reloadDataBase();
        return "redirect:/web/workLoad/get/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createWorkLoad(Model model){
        WorkLoadForm workLoadForm = new WorkLoadForm();
        for (Teacher teacher:teacherService.getAll()){
            movs.put(teacher.getId(),teacher.getName());
        }
        for (Group group:groupService.getAll()){
            mavs.put(group.getId(),group.getName());
        }
        model.addAttribute("movs",movs);
        model.addAttribute("mavs",mavs);
        model.addAttribute("workLoadForm", workLoadForm);
        return "addWorkLoad";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createWorkLoad(Model model, @ModelAttribute("workLoadForm") WorkLoadForm workLoadForm){
        WorkLoad workLoad = new WorkLoad();
        workLoad.setGroup(workLoadForm.getGroup());
        workLoad.setTeacher(workLoadForm.getTeacher());
        workLoad.setSubject(workLoadForm.getSubject());
        workLoadService.create(workLoad);

        model.addAttribute("workLoads",workLoadService.getAll());
        return "redirect:/web/workLoad/get/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateWorkLoad(@PathVariable("id") String id, Model model){
        WorkLoad workLoad = workLoadService.get(id);
        WorkLoadForm workLoadForm = new WorkLoadForm(
                workLoad.getId(),
                workLoad.getGroup(),
                workLoad.getTeacher(),
                workLoad.getSubject(),
                workLoad.getTypeOfClass(),
                workLoad.getAmountOfHours(),
                workLoad.getPayment()
        );
        for (Teacher teacher:teacherService.getAll()){
            movs.put(teacher.getId(),teacher.getName());
        }
        for (Group group:groupService.getAll()){
            mavs.put(group.getId(),group.getName());
        }
        model.addAttribute("movs",movs);
        model.addAttribute("mavs",mavs);
        model.addAttribute("workLoadForm", workLoadForm);
        return "updateWorkLoad";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateWorkLoad(Model model, @PathVariable("id") String id, @ModelAttribute("teacherForm") WorkLoadForm workLoadForm){
        WorkLoad workLoad = new WorkLoad();
        workLoad.setId(id);
        workLoad.setGroup(workLoadForm.getGroup());
        workLoad.setTeacher(workLoadForm.getTeacher());
        workLoad.setSubject(workLoadForm.getSubject());
        workLoadService.update(workLoad);
        model.addAttribute("workLoads",workLoadService.getAll());
        return "redirect:/web/workLoad/get/list";
    }
}

