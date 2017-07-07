package designpatterns.dao;

/**
 * Created by kumarris on 28/12/16.
 */
public class Student {
    int rollNumber;
    String name;

    public Student() {

    }
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
