package com.crudspringboot.SpringbootCrud.service;

import com.crudspringboot.SpringbootCrud.models.Student;
import com.crudspringboot.SpringbootCrud.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public Optional<Student> updateStudent(String id, Student student) {
        return studentRepository.findById(id)
            .map(existingStudent -> {
                existingStudent.setName(student.getName());
                existingStudent.setLastName(student.getLastName());
                existingStudent.setEmail(student.getEmail());
                existingStudent.setDob(student.getDob());
                existingStudent.setAge(student.getAge());

                return studentRepository.save(existingStudent);
            });
    }

    public Optional<Student> deleteStudent(String id) {
        return studentRepository.findById(id)
                .map(response -> {
                    studentRepository.delete(response);
                    return response;
                });
    }
}
