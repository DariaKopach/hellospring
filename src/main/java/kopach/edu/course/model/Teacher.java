package kopach.edu.course.model;
/**
 @author Kopach Daria
 @date 10.08.2020
 @version 1.0
 Copyright (c) Kopach Daria
 */

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Teacher {
    @Id
    private String id;
    private String name;
    private String surname;
    private String description;
    private String mobile;
    private int experience;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;

    public Teacher() {
    }

    public Teacher(String name, String surname, String description, String mobile, int experience) {
        this.name = name;
        this.surname = surname;
        this.description = description;
        this.mobile = mobile;
        this.experience = experience;
    }

    public Teacher(String id, String name, String surname, String description, String mobile, int experience) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.description = description;
        this.mobile = mobile;
        this.experience = experience;
    }

    public Teacher(String id, String name, String surname, String description, String mobile, int experience, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.description = description;
        this.mobile = mobile;
        this.experience = experience;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
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
        return "Teacher{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", description='" + description + '\'' +
                ", mobile='" + mobile + '\'' +
                ", experience=" + experience +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return getId().equals(teacher.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
