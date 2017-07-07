package designpatterns.dao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kumarris on 28/12/16.
 */
public class StudentDAOImpl implements StudentDAO {

    List<Student> listOfStudents = new ArrayList<>();

    //This serves as a DataSource for us
    public StudentDAOImpl() {
        Student std1 = new Student("Ram", 0);
        Student std2 = new Student("Shyam", 1);
        Student std3 = new Student();
        Student std4 = new Student();
        Student std41 = new Student();

        std3.setName("Mohan");
        std3.setRollNumber(2);

        std4.setName("Radha");
        std4.setRollNumber(3);

        std41.setName("Mohammad");
        std41.setRollNumber(4);

        listOfStudents.add(std1);
        listOfStudents.add(std2);
        listOfStudents.add(std3);
        listOfStudents.add(std4);
        listOfStudents.add(std41);
    }

    public List<Student> getAllStudents() {
        return listOfStudents;
    }

    public Student getStudent(int rollNumber) {
        return listOfStudents.get(rollNumber);
    }

    public void updateStudent(Student student, String itemToBeUpdated, String UpdatedValue) {
        Student std = listOfStudents.get(student.getRollNumber());
        switch (itemToBeUpdated) {
            case "name": std.setName(UpdatedValue); break;
            case "rollNumber": std.setRollNumber(Integer.parseInt(UpdatedValue)); break;
            default: System.out.println("The "+itemToBeUpdated+" is not a property of the Student"); break;
        }
    }

    public boolean removeStudent(Student student) {
        return listOfStudents.remove(listOfStudents.get(student.getRollNumber()));
    }

}
