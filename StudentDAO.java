package designpatterns.dao;

import java.util.List;

/**
 * Created by kumarris on 28/12/16.
 */
public interface StudentDAO {

    List<Student> getAllStudents();
    Student getStudent(int rollNumber);
    void updateStudent(Student student, String updatebleItem, String UpdatedValue);
    boolean removeStudent(Student student);
}
