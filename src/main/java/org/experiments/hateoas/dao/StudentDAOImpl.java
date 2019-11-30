package org.experiments.hateoas.dao;

import org.experiments.hateoas.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentDAOImpl implements IStudentDAO{

    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        Student firstStudent = Student.builder().studentName("Soumik1").courseName("Advanced Java").courseDurationInMonths(6).build();
        Student secondStudent = Student.builder().studentName("Soumik2").courseName("REST").courseDurationInMonths(6).build();
        Student thirdStudent = Student.builder().studentName("Soumik3").courseName("Clean Code").courseDurationInMonths(6).build();
        Student fourthStudent = Student.builder().studentName("Soumik4").courseName("Graal VM").courseDurationInMonths(6).build();
        Student fifthStudent = Student.builder().studentName("Soumik5").courseName("Spring Boot").courseDurationInMonths(6).build();
        studentList.add(firstStudent);
        studentList.add(secondStudent);
        studentList.add(thirdStudent);
        studentList.add(fourthStudent);
        studentList.add(fifthStudent);
        return studentList;
    }
}
