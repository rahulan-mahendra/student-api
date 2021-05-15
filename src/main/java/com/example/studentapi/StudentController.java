package com.example.studentapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    StudentRepository repository = new inMemoryStudentRepository();

    //REST ENDPOINTS
    //create a student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){
        repository.save(student);
    }

    //retrieve a student
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){
        return repository.get(id);
    }

    //delete a student
    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable String id){
        repository.remove(id);
    }

    //update a student
    @PutMapping("/student/{id}")
    public void updateStudent(@RequestBody Student student){
        repository.update(student);
    }

}
