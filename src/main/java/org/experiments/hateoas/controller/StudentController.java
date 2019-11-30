package org.experiments.hateoas.controller;

import org.experiments.hateoas.model.Student;
import org.experiments.hateoas.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@RestController
public class StudentController
{
    @Autowired
     private IStudentService iStudentService;

    @GetMapping(value = "/employees", produces = { "application/hal+json" })
    public List<Student> getAllStudents(){
        List<Student> studentList =  iStudentService.getAllStudents();
        for (Student student: studentList){
            Link selfLink = linkTo(StudentController.class).slash(student.getStudentName()).withSelfRel();
            student.add(selfLink);
        }
        return studentList;
    }

}
