package com.example.example.service;

import com.example.example.pojo.Student;
import com.example.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class StudentService {
    @Autowired

    private StudentRepository studentRepository;
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }
    public void deleteStudentById(long id)
    {
        studentRepository.deleteById(id);
    }
    public void deleteStudents(){
        studentRepository.deleteAll();
    }
    public List<Student> getStudentsByDeptId(Long departmentId){
        List<Student> list=studentRepository.findAll();
        List<Student> ans=new ArrayList<>();
        for(Student s:list){
            if(s.getDepartmentId()==departmentId) ans.add(s);
        }
        return ans;
    }
    public List<Student> getStudentsByFirstName(String first_name) {



        return  studentRepository.findByTitleLikeCaseInsensitive(first_name);

    }
    public Student updateStudent(Student student, long id) {

        Student depDB = studentRepository.findById(id).get();

        if (Objects.nonNull(student.getFirstName()) && !"".equalsIgnoreCase(student.getFirstName())) {
            depDB.setFirstName(
                    student.getFirstName());
        }

        if (Objects.nonNull(student.getLastName()) && !"".equalsIgnoreCase(student.getLastName())) {
            depDB.setLastName(
                    student.getLastName());
        }

        if (Objects.nonNull(student.getEmailId()) && !"".equalsIgnoreCase(student.getEmailId())) {
            depDB.setEmailId(
                    student.getEmailId());
        }
        if (Objects.nonNull(student.getGender()) && !"".equalsIgnoreCase(student.getGender())) {
            depDB.setGender(
                    student.getGender());
        }
        if (Objects.nonNull(student.getDepartmentId())) {
            depDB.setDepartmentId(
                    student.getDepartmentId());
        }

        return studentRepository.save(depDB);
    }

}
