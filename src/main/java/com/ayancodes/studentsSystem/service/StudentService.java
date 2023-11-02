package com.ayancodes.studentsSystem.service;
import com.ayancodes.studentsSystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
