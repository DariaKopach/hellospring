package kopach.edu.course.form;
/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 Description:
 */

import kopach.edu.course.model.Teacher;
import org.springframework.stereotype.Service;

public class SalaryCalculationForm {

    private String id;
    private Teacher teacher;
    private int amountOfLectures;
    private int priceForLectureHours;
    private int amountOfPractice;
    private int priceForPracticeHours;
    private int totalSalary;

    public SalaryCalculationForm() {
    }

    public SalaryCalculationForm(Teacher teacher, int amountOfLectures, int priceForLectureHours, int amountOfPractice, int priceForPracticeHours, int totalSalary) {
        this.teacher = teacher;
        this.amountOfLectures = amountOfLectures;
        this.priceForLectureHours = priceForLectureHours;
        this.amountOfPractice = amountOfPractice;
        this.priceForPracticeHours = priceForPracticeHours;
        this.totalSalary = totalSalary;
    }

    public SalaryCalculationForm(String id, Teacher teacher, int amountOfLectures, int priceForLectureHours, int amountOfPractice, int priceForPracticeHours, int totalSalary) {
        this.id = id;
        this.teacher = teacher;
        this.amountOfLectures = amountOfLectures;
        this.priceForLectureHours = priceForLectureHours;
        this.amountOfPractice = amountOfPractice;
        this.priceForPracticeHours = priceForPracticeHours;
        this.totalSalary = totalSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getAmountOfLectures() {
        return amountOfLectures;
    }

    public void setAmountOfLectures(int amountOfLectures) {
        this.amountOfLectures = amountOfLectures;
    }

    public int getPriceForLectureHours() {
        return priceForLectureHours;
    }

    public void setPriceForLectureHours(int priceForLectureHours) {
        this.priceForLectureHours = priceForLectureHours;
    }

    public int getAmountOfPractice() {
        return amountOfPractice;
    }

    public void setAmountOfPractice(int amountOfPractice) {
        this.amountOfPractice = amountOfPractice;
    }

    public int getPriceForPracticeHours() {
        return priceForPracticeHours;
    }

    public void setPriceForPracticeHours(int priceForPracticeHours) {
        this.priceForPracticeHours = priceForPracticeHours;
    }

    public int getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(int totalSalary) {
        this.totalSalary = totalSalary;
    }
}
