package com.example.studentapi;

import java.util.HashMap;
import java.util.Map;

public class inMemoryStudentRepository implements StudentRepository {

    Map<String,Student> database = new HashMap<>();

    @Override
    public void save(Student student) {
        database.put(student.id, student);
        System.out.println("Student saved in the database");
    }

    @Override
    public Student get(String id) {
        return database.get(id);
    }

    @Override
    public void remove(String id) {
        database.remove(id);
        System.out.println("Student deleted in the database");
    }

    @Override
    public void update(Student student){
        database.put(student.id, student);
        System.out.println("Student updated in the database");
    }
}
