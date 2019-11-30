package org.experiments.hateoas.service;

import org.experiments.hateoas.dao.IStudentDAO;
import org.experiments.hateoas.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDAO iStudentDAO;

    @Override
    public List<Student> getAllStudents() {
        return iStudentDAO.getAllStudents();
    }
}
