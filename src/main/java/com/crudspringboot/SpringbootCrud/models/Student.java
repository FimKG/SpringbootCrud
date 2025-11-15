package com.crudspringboot.SpringbootCrud.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "student_info")
@Setter
@Getter
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String lastName;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student(String name, String lastName, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
