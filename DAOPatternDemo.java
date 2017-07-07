package designpatterns.dao;

import java.util.List;

/**
 * Created by kumarris on 28/12/16.
 */
public class DAOPatternDemo {

    public static void main(String[] args) {
        StudentDAO student = new StudentDAOImpl();

        System.out.println("Display All Students");
        displayAllStudents(student);

        //Update Name of the Student: From Mohan to Madhav
        student.updateStudent(student.getStudent(2), "name", "Madhav");

        System.out.println("Display All Students: Again");
        displayAllStudents(student);

        //Remove student Mohammad
        student.removeStudent(student.getStudent(4));
        System.out.println("Display All Students: Once Again");
        displayAllStudents(student);
    }

    public static void displayAllStudents(StudentDAO studentDAO) {
        List<Student> listOfStudents = studentDAO.getAllStudents();
        for (Student s : listOfStudents)
            System.out.println("Name: "+s.getName()+"; Roll Number: "+s.getRollNumber());

        System.out.println("----------------------------------------------------------");
    }
}
