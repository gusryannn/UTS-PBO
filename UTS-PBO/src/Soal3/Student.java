package Soal3;

import java.util.List;
import Soal2.*;

public class Student {
    private String name;
    private String studentId;
    private List<Course> courses;

    public Student(String name, String studentId, List<Course> courses) {
        this.name = name;
        this.studentId = studentId;
        this.courses = courses;
    }

    public void displayStudentInfo() {
        System.out.println("Student: " + name + " (" + studentId + ")");
        System.out.println("Courses:");
        for (Course c : courses) {
            c.displayInfo();
        }
    }
}




