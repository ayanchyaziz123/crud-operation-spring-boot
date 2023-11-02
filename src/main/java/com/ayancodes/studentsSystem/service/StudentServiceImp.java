package com.ayancodes.studentsSystem.service;

import com.ayancodes.studentsSystem.model.Student;
import com.ayancodes.studentsSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        System.out.println("student service");
        return studentRepository.save(student);
    }
    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
