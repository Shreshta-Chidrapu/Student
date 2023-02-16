package com.example.example.repository;

import com.example.example.pojo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query("SELECT t FROM Student t where t.firstName LIKE %:c%")
   public List<Student> findByTitleLikeCaseInsensitive(@Param("c") String first_name);

    @Query("SELECT t FROM Student t where t.departmentId=:departmentId")
    public List<Student> findByDeptId(@Param("departmentId") Long departmentId);



}
