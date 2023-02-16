package com.example.example.controller;

import com.example.example.pojo.Student;
import com.example.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/student")
public class StudentController {
  @Autowired
    private StudentService studentService;
//create a record
    @PostMapping("/save")
    @ResponseBody
    public  Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }
    @GetMapping("/get")
  @ResponseBody
  public List<Student> getStudent() {
      return studentService.getStudent();
   }
    @PutMapping("/{id}")
@ResponseBody
    public Student
    updateStudent(@RequestBody Student student, @PathVariable("id") Long id)
    {
        return studentService.updateStudent(student, id);
    }


    @DeleteMapping("/{id}")
   @ResponseBody
    public String deleteStudentById(@PathVariable("id") Long id)
    {
        studentService.deleteStudentById(id);
        return "Deleted Successfully";
    }

    @DeleteMapping("/all")
    @ResponseBody
    public String deleteStudents(){
        studentService.deleteStudents();
        return "deleted all rows successfully";
    }

    @GetMapping("/get/{firstName}")
    @ResponseBody
    public List<Student> getStudentsByName(@PathVariable String firstName){
        return studentService.getStudentsByFirstName(firstName);
    }
   @GetMapping("/get/dept/{id}")
    @ResponseBody
    public List<Student> getStudentByDept(@PathVariable("id") Long id){
        return studentService.getStudentsByDept(id);
   }
}
