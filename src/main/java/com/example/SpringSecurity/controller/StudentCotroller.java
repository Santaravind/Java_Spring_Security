package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.model.StudentEntity;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@RequestMapping
public class StudentCotroller {

private List<StudentEntity> students = new ArrayList<>(List.of(
    new StudentEntity(1,"sant",78) ,
    new StudentEntity(2,"Aravind",75)
));

@GetMapping("/csrf-token")
public CsrfToken getCsrfToken(HttpServletRequest request){
    return (CsrfToken) request.getAttribute("_csrf");
}

@GetMapping("/students")
private  List<StudentEntity> getStudent(){
    return  students;
}

@PostMapping("/students")
    public  StudentEntity addStudent(@RequestBody StudentEntity student){
    students.add(student);
    return  student;
}



}
