package kopach.edu.course.model;
/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 */

import java.time.LocalDateTime;
import java.util.Objects;

public class Group {
    private String id;
    private String name;
    private String specialty;
    private String department;
    private String description;
    private int amountOfStudents;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public Group() {
    }

    public Group(String name, String specialty, String department, String description, int amountOfStudents) {
        this.name = name;
        this.specialty = specialty;
        this.department = department;
        this.description = description;
        this.amountOfStudents = amountOfStudents;
    }

    public Group(String id, String name, String specialty, String department, String description, int amountOfStudents) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.department = department;
        this.description = description;
        this.amountOfStudents = amountOfStudents;
    }

    public Group(String id, String name, String specialty, String department, String description, int amountOfStudents, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.department = department;
        this.description = description;
        this.amountOfStudents = amountOfStudents;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmountOfStudents() {
        return amountOfStudents;
    }

    public void setAmountOfStudents(int amountOfStudents) {
        this.amountOfStudents = amountOfStudents;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", specialty='" + specialty + '\'' +
                ", department='" + department + '\'' +
                ", description='" + description + '\'' +
                ", amountOfStudents=" + amountOfStudents +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(getId(), group.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
