package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
@Autowired

StudentRepository repository;
public String addStudent(Student student) {
repository.save(student);
return "Added";
}
public Optional<Student> getStudentById(int id)

{
return repository.findById(id);
}
public String UpdateStudent(Student student)
{
repository.save(student);
return "Updated";
}
public String DeleteStudent(int id)
{
repository.deleteById(id);
return "Deleted";
}
}
