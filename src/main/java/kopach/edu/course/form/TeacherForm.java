package kopach.edu.course.form;
/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 Description:
 */

public class TeacherForm {
    private String id;
    private String name;
    private String surname;
    private String description;
    private String mobile;
    private int experience;

    public TeacherForm() {
    }

    public TeacherForm(String name, String surname, String description, String mobile, int experience) {
        this.name = name;
        this.surname = surname;
        this.description = description;
        this.mobile = mobile;
        this.experience = experience;
    }


    public TeacherForm(String id, String name, String surname, String description, String mobile, int experience) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.description = description;
        this.mobile = mobile;
        this.experience = experience;
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

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "TeacherForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", description='" + description + '\'' +
                ", mobile='" + mobile + '\'' +
                ", experience=" + experience +
                '}';
    }
}
