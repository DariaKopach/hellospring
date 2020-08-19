package kopach.edu.course.form;/*
 @author Vladyslav Zaichenko
 @since 11 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

import kopach.edu.course.model.Group;
import kopach.edu.course.model.Teacher;

public class WorkLoadForm {
    private String id;
    private Group group;
    private Teacher teacher;
    private String subject;
    private String typeOfClass;
    private int amountOfHours;
    private double payment;

    public WorkLoadForm() {
    }


    public WorkLoadForm(Group group, Teacher teacher, String subject, String typeOfClass, int amountOfHours, double payment) {
        this.group = group;
        this.teacher = teacher;
        this.subject = subject;
        this.typeOfClass = typeOfClass;
        this.amountOfHours = amountOfHours;
        this.payment = payment;
    }

    public WorkLoadForm(String id, Group group, Teacher teacher, String subject, String typeOfClass, int amountOfHours, double payment) {
        this.id = id;
        this.group = group;
        this.teacher = teacher;
        this.subject = subject;
        this.typeOfClass = typeOfClass;
        this.amountOfHours = amountOfHours;
        this.payment = payment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTypeOfClass() {
        return typeOfClass;
    }

    public void setTypeOfClass(String typeOfClass) {
        this.typeOfClass = typeOfClass;
    }

    public int getAmountOfHours() {
        return amountOfHours;
    }

    public void setAmountOfHours(int amountOfHours) {
        this.amountOfHours = amountOfHours;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "WorkLoadForm{" +
                "id='" + id + '\'' +
                ", group=" + group +
                ", teacher=" + teacher +
                ", subject='" + subject + '\'' +
                ", typeOfClass='" + typeOfClass + '\'' +
                ", amountOfHours=" + amountOfHours +
                ", payment=" + payment +
                '}';
    }
}
