package com.example.example.pojo;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;
    @Column(name="email_Id")
    private String emailId;
    @Column(name="dept_id")
    private long departmentId;
    @Column(name="gender")
    private String gender;
    public Student(){

    }
    public Student(String firstName,String lastName,String emailId,long departmentId,String gender){
        super();
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailId=emailId;
        this.departmentId=departmentId;
        this.gender=gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId=departmentId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}


//why camelcase and snake case for tables
//why we need to add default constructor?
//deleteAll records
//search by name
//get by id
//chrome dev tools
