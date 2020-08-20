package kopach.edu.course.datastorage;
/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 Description:
 */

import kopach.edu.course.model.SalaryCalculation;
import kopach.edu.course.repository.SalaryCalculationRepository;
import kopach.edu.course.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kopach.edu.course.model.Group;
import kopach.edu.course.model.Teacher;
import kopach.edu.course.model.WorkLoad;
import kopach.edu.course.repository.GroupRepository;
import kopach.edu.course.repository.WorkLoadRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake {

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    GroupRepository groupRepository;

    @Autowired
    WorkLoadRepository workLoadRepository;

    @Autowired
    SalaryCalculationRepository salaryCalculationRepository;

    private List<Teacher> teachers = new LinkedList<>(
            Arrays.asList(
                    new Teacher("Yuriy", "Prokhorov","teacher","+42135452563",30),
                    new Teacher("Marian", "Kovac","teacher","+421135454636",5),
                    new Teacher("Stanislav", "Filip","teacher","+42165563635",40)
            )
    );

    private List<Group> groups = new LinkedList<>(
            Arrays.asList(
                    new Group("First Group", "International Business Analytics","1","First-year student",17),
                    new Group("Second Group", "Programming Engineering","1","Second-year student",11),
                    new Group("Third Group", "Computer Science","1","First-year student",25)
            )
    );

    private List<WorkLoad> workLoads = new LinkedList<>(
            Arrays.asList(
                    new WorkLoad(groups.get(0),teachers.get(0),"java","lecture",10,8.87),
                    new WorkLoad(groups.get(1),teachers.get(1),"java","practice",10,8.87),
                    new WorkLoad(groups.get(2),teachers.get(2),"java","practice",10,8.87)
            )
    );

    private  List<SalaryCalculation> salaryCalculations =new LinkedList<>(
            Arrays.asList(
                new SalaryCalculation(teachers.get(0),2,35,6,40,310),
                    new SalaryCalculation(teachers.get(1),2,35,6,40,310),
                    new SalaryCalculation(teachers.get(2),2,35,6,40,310)
                    )
    );

    @PostConstruct
    public void init(){
        teacherRepository.deleteAll();
        teacherRepository.saveAll(teachers);
        groupRepository.deleteAll();
        groupRepository.saveAll(groups);
        workLoadRepository.deleteAll();
        workLoadRepository.saveAll(workLoads);
        salaryCalculationRepository.deleteAll();
        salaryCalculationRepository.saveAll(salaryCalculations);


    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Group> getWorkLoads() {
        return groups;
    }

    public void setWorkLoads(List<Group> groups) {
        this.groups = groups;
    }

    public List<SalaryCalculation> getSalaryCalculations() {
        return salaryCalculations;
    }

    public void setSalaryCalculations(List<SalaryCalculation> salaryCalculations) {
        this.salaryCalculations = salaryCalculations;
    }


}
