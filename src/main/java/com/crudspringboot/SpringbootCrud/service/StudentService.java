package com.crudspringboot.SpringbootCrud.service;

import com.crudspringboot.SpringbootCrud.models.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {

    public List<Student> getStudent() {


        return List.of(
                new Student(
                        1L, "Hlohlo", "Moloto",
                        "email@gmail.com", LocalDate.of(2000, Month.SEPTEMBER, 29),
                        02
                )
        );
    }
}
