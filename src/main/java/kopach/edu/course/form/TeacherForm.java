package kopach.edu.course.form;/*
 @author Vladyslav Zaichenko
 @since 11 сер 2020
 @version 1.0.0 
 Copyright (c) Vladyslav Zaichenko 
 Description:
 */

public class TeacherForm {
    private String id;
    private String name;
    private String description;
    private String mobile;

    public TeacherForm() {
    }

    public TeacherForm(String name, String description, String mobile) {
        this.name = name;
        this.description = description;
        this.mobile = mobile;
    }

    public TeacherForm(String id, String name, String description, String telephone) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.mobile = mobile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMobile() {
        return mobile;
    }

    public void setTelephone(String telephone) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "TeacherForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", telephone='" + mobile + '\'' +
                '}';
    }
}
