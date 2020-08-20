package kopach.edu.course.controller.rest;
/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 Description:
 */

import kopach.edu.course.model.SalaryCalculation;
import kopach.edu.course.model.WorkLoad;
import kopach.edu.course.service.salaryCalculation.impls.SalaryCalculationServiceImpl;
import kopach.edu.course.service.workLoad.impls.WorkLoadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salaryCalculation")
public class SalaryCalculationRestController {

    @Autowired
    SalaryCalculationServiceImpl salaryCalculationService;

    @GetMapping("/hello")
    String getHello(){
        return "<h1>Hello, from Work Load Controller</h1>";
    }

    @RequestMapping(value = "/get/list",method = RequestMethod.GET)
    List<SalaryCalculation> getSalaryServiceList(){
        return salaryCalculationService.getAll();
    }

    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    SalaryCalculation getSalaryCalculation(@PathVariable("id") String id){
        return salaryCalculationService.get(id);
    }

}