package kopach.edu.course.repository;
/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 */

import kopach.edu.course.model.SalaryCalculation;
import kopach.edu.course.model.WorkLoad;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryCalculationRepository extends MongoRepository<SalaryCalculation, String> {

}
