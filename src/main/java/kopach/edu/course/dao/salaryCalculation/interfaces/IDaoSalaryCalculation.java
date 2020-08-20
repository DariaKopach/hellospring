package kopach.edu.course.dao.salaryCalculation.interfaces;/*
/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 Description:
 */
import kopach.edu.course.model.SalaryCalculation;
import kopach.edu.course.model.WorkLoad;

import java.util.List;

public interface IDaoSalaryCalculation {
    SalaryCalculation create(SalaryCalculation salaryCalculation);
    SalaryCalculation get(String id);
    SalaryCalculation delete(String id);
    SalaryCalculation update(SalaryCalculation salaryCalculation);
    List<SalaryCalculation> getAll();
}
