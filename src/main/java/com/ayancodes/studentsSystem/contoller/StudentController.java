package com.ayancodes.studentsSystem.contoller;

import com.ayancodes.studentsSystem.model.Student;
import com.ayancodes.studentsSystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/add")
    public String add(@RequestBody Student student)
    {
        System.out.println("controller");
        studentService.saveStudent(student);
        return "new student added";
    }
    @GetMapping("/getAll")
    public List<Student>getAllStudents()
    {
        return studentService.getAllStudents();
    }
}
