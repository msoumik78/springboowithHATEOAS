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
        Student firstStudent = Student.builder().studentName("Soumik").courseName("Advanced Java").courseDurationInMonths(6).build();
        studentList.add(firstStudent);
        return studentList;
    }
}
