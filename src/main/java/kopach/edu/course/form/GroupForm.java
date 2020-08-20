package kopach.edu.course.form;
/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 Description:
 */


public class GroupForm {
    private String id;
    private String name;
    private String specialty;
    private String department;
    private String description;
    private int amountOfStudents;

    public GroupForm() {
    }

    public GroupForm(String name, String specialty, String department, String description, int amountOfStudents) {
        this.name = name;
        this.specialty = specialty;
        this.department = department;
        this.description = description;
        this.amountOfStudents = amountOfStudents;
    }

    public GroupForm(String id, String name, String specialty, String department, String description, int amountOfStudents) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.department = department;
        this.description = description;
        this.amountOfStudents = amountOfStudents;
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

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAmountOfStudents() {
        return amountOfStudents;
    }

    public void setAmountOfStudents(int amountOfStudents) {
        this.amountOfStudents = amountOfStudents;
    }

    @Override
    public String toString() {
        return "GroupForm{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
