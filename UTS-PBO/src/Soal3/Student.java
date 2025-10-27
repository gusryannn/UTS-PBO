package Soal3;

import java.util.*;
import Soal1.Course; // pastikan ini pakai Soal1, bukan Soal2!

public class Student {
    private String name;
    private String studentId;
    private List<Course> courses; // gunakan Soal1.Course

    public Student(String name, String studentId, List<Course> courses) {
        this.name = name;
        this.studentId = studentId;
        this.courses = courses;
    }

    public void displayStudentInfo() {
        System.out.println("Nama Mahasiswa : " + name);
        System.out.println("NIM            : " + studentId);
        System.out.println("Daftar Mata Kuliah :");
        for (Course c : courses) {
            c.displayInfo();
        }
    }
}
