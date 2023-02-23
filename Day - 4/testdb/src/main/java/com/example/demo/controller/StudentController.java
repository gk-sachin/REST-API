package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.services.StudentService;

@RestController
public class StudentController {
@Autowired

StudentService service;
@PostMapping("/student")
public String create(@RequestBody Student student) {

return service.addStudent(student);
}
@GetMapping("/student/{id}")
public Optional<Student> readById(@PathVariable int id)
{
return service.getStudentById(id);
}
@PutMapping("/customer")
public String updatecustomer(@RequestBody Student student)
{
return service.UpdateStudent(student);
}
@DeleteMapping("/customer/")
public String deletecustomer(@RequestParam int id)
{
return service.DeleteStudent(id);
}

}
