package kopach.edu.course.service.salaryCalculation.interfaces;
/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 */

import kopach.edu.course.model.SalaryCalculation;
import kopach.edu.course.model.WorkLoad;

import java.util.List;

public interface ISalaryCalculationService {

    // crud
    SalaryCalculation create (SalaryCalculation salaryCalculation);
    SalaryCalculation get(String id);
    SalaryCalculation delete (String id);
    SalaryCalculation update (SalaryCalculation salaryCalculation);
    List<SalaryCalculation> getAll();

//    List<WorkLoad> searchByName(String str);
//    List<WorkLoad> searchByString(String str);
//    List<WorkLoad> sortByName(String name, String order);
}
