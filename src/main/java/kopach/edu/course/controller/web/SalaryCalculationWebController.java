package kopach.edu.course.controller.web;
/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 Description:
 */

import kopach.edu.course.form.SalaryCalculationForm;
import kopach.edu.course.form.WorkLoadForm;
import kopach.edu.course.model.Group;
import kopach.edu.course.model.SalaryCalculation;
import kopach.edu.course.model.Teacher;
import kopach.edu.course.model.WorkLoad;
import kopach.edu.course.service.group.impls.GroupServiceImpl;
import kopach.edu.course.service.salaryCalculation.impls.SalaryCalculationServiceImpl;
import kopach.edu.course.service.teacher.impls.TeacherServiceImpl;
import kopach.edu.course.service.workLoad.impls.WorkLoadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/web/salaryCalculation")
public class SalaryCalculationWebController {

    @Autowired
    WorkLoadServiceImpl workLoadService;

    @Autowired
    TeacherServiceImpl teacherService;

    @Autowired
    GroupServiceImpl groupService;

    @Autowired
    SalaryCalculationServiceImpl salaryCalculationService;

    Map<String, String> mevs;

    @PostConstruct
    void init(){

        mevs = new HashMap<>();

    }

    @RequestMapping("/get/list")
    String showAll(Model model){
        model.addAttribute("list",salaryCalculationService.getAll());
        return "salaryCalculationList";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String deleteSalaryCalculation(@PathVariable("id") String id, Model model) {
        salaryCalculationService.delete(id);
        model.addAttribute("list", salaryCalculationService.getAll());
        return "redirect:/web/salaryCalculation/get/list";
    }

    @RequestMapping(value = "/reloadDB", method = RequestMethod.GET)
    String reloadDataBase() {
        salaryCalculationService.reloadDataBase();
        return "redirect:/web/salaryCalculation/get/list";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String createSalaryCalculation(Model model){
        SalaryCalculationForm salaryCalculationForm = new SalaryCalculationForm();
        for (Teacher teacher:teacherService.getAll()){
            mevs.put(teacher.getId(),teacher.getName());
        }
        model.addAttribute("mevs",mevs);
        model.addAttribute("salaryCalculationForm", salaryCalculationForm);
        return "addSalaryCalculation";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createSalaryCalculation(Model model, @ModelAttribute("salaryCalculationForm") SalaryCalculationForm salaryCalculationForm){
        SalaryCalculation salaryCalculation = new SalaryCalculation();
        salaryCalculation.setId(salaryCalculationForm.getId());
        salaryCalculation.setTeacher(salaryCalculationForm.getTeacher());
        salaryCalculation.setAmountOfLectures(salaryCalculationForm.getAmountOfLectures());
        salaryCalculation.setPriceForLectureHours(salaryCalculationForm.getPriceForLectureHours());
        salaryCalculation.setAmountOfPractice(salaryCalculationForm.getAmountOfPractice());
        salaryCalculation.setPriceForPracticeHours(salaryCalculationForm.getPriceForPracticeHours());
        salaryCalculation.setTotalSalary(salaryCalculationForm.getTotalSalary());

        salaryCalculationService.create(salaryCalculation);

        model.addAttribute("salaryCalculation",salaryCalculationService.getAll());
        return "redirect:/web/salaryCalculation/get/list";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String updateSalaryCalculation(@PathVariable("id") String id, Model model){
        SalaryCalculation salaryCalculation = salaryCalculationService.get(id);
        SalaryCalculationForm salaryCalculationForm = new SalaryCalculationForm(
                salaryCalculation.getId(),
                salaryCalculation.getTeacher(),
                salaryCalculation.getAmountOfLectures(),
                salaryCalculation.getPriceForLectureHours(),
                salaryCalculation.getAmountOfPractice(),
                salaryCalculation.getPriceForPracticeHours(),
                salaryCalculation.getTotalSalary()
        );
        for (Teacher teacher:teacherService.getAll()){
            mevs.put(teacher.getId(),teacher.getName());
        }
        model.addAttribute("mevs",mevs);
        model.addAttribute("salaryCalculationForm", salaryCalculationForm);
        return "updateSalaryCalculation";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public String updateWorkLoad(Model model, @PathVariable("id") String id, @ModelAttribute("salaryCalculationForm") SalaryCalculationForm salaryCalculationForm){
        SalaryCalculation salaryCalculation = new SalaryCalculation();
        salaryCalculation.setId(salaryCalculation.getId());
        salaryCalculation.setAmountOfLectures(salaryCalculationForm.getAmountOfLectures());
        salaryCalculation.setAmountOfLectures(salaryCalculationForm.getAmountOfLectures());
        salaryCalculation.setPriceForLectureHours(salaryCalculationForm.getPriceForLectureHours());
        salaryCalculation.setAmountOfPractice(salaryCalculationForm.getAmountOfPractice());
        salaryCalculation.setPriceForPracticeHours(salaryCalculationForm.getPriceForPracticeHours());
        salaryCalculation.setTotalSalary(salaryCalculationForm.getTotalSalary());
        salaryCalculationService.update(salaryCalculation);
        model.addAttribute("salaryCalculation",salaryCalculationService.getAll());
        return "redirect:/web/salaryCalculation/get/list";
    }
}

