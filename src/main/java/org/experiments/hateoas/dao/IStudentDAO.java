package org.experiments.hateoas.dao;

import org.experiments.hateoas.model.Student;
import java.util.List;

public interface IStudentDAO {
    public List<Student> getAllStudents();

}
