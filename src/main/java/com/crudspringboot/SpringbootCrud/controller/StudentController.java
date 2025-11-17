package com.crudspringboot.SpringbootCrud.controller;

import com.crudspringboot.SpringbootCrud.models.Student;
import com.crudspringboot.SpringbootCrud.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {
    /**
     * Inject Service class
     */
    @Autowired
    StudentService studentService;

    /**
     * HTTP POST to create a new student record.
     * Create	POST	http://localhost:8080/student/create	{ "name": "John", "email": "john@example.com" }
     *
     * @param student the Student object received in the request body, containing student details
     * @return ResponseEntity containing the created Student object and HTTP status 201 (Created)
     *         or 400 Bad Request response
     */
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
//        return new ResponseEntity<>((studentService.createStudent(student)),HttpStatus.CREATED);
        return Optional.ofNullable(studentService.createStudent(student))
                .map(response -> ResponseEntity.status(HttpStatus.CREATED).body(response))
                .orElseGet(() -> ResponseEntity.badRequest().build());
    }

    /**
     * HTTP GET retrieve all student records.
     * Read all	GET	http://localhost:8080/student/getAll
     *
     * @return {@link ResponseEntity} containing a list of {@link Student} objects
     *         or 404 Not Found response
     */
    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getStudent() {
        return Optional.ofNullable(studentService.getStudent())
                .filter(list -> !list.isEmpty())
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * HTTP PUT to Updates an existing student record identified by the given ID.
     * Update	PUT	http://localhost:8080/student/updateById/1	{ "name": "Johnny", "email": "johnny@example.com" }
     *
     * @param id the unique identifier of the student
     * @param student the updated student details
     *
     * @return ResponseEntity containing the updated student
     *         or 404 Not Found response
     */
    @PutMapping("/updateById/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable String id, @RequestBody Student student) {
        return studentService.updateStudent(id, student)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * HTTP DELETE to Deletes an existing student record identified by the given ID.
     * Delete	DELETE	http://localhost:8080/student/deleteById/1
     *
     * @param id the unique identifier of the student
     *
     * @return ResponseEntity containing the updated student
     *         or 404 Not Found response
     */
    @DeleteMapping("/deleteById/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable String id) {
        return studentService.deleteStudent(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
