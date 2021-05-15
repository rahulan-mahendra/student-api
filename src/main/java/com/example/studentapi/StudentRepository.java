package com.example.studentapi;

public interface StudentRepository {

    //to save student in inmemory database
    void save(Student student);

    //to receive student in inmemory database
    Student get(String id);

    //to delete student in inmemory database
    void remove(String id);

    //to update student in inmemory database
    void update(Student student);
}
