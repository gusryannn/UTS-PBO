// Import hanya yang tidak konflik
import Soal3.*;
import Soal4.*;
import Soal5.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // SOAL 1 - pakai Soal1.Course
        System.out.println("=== SOAL 1: CLASS & OBJECT ===");
        Soal1.Course course1 = new Soal1.Course("Pemrograman Berorientasi Objek", 3, "Pak Budi");
        course1.displayInfo();

        // SOAL 2 - pakai Soal2.Course (atau EncapsulatedCourse, tergantung namanya)
        System.out.println("\n=== SOAL 2: ENCAPSULATION ===");
        Soal2.Course course2 = new Soal2.Course("Basis Data", -2, "Bu Ayu");
        course2.displayInfo();
        course2.setCredit(4);
        System.out.println("Setelah diperbaiki:");
        course2.displayInfo();

        // SOAL 3
        System.out.println("\n=== SOAL 3: RELATIONSHIP (AGGREGATION) ===");
        List<Soal1.Course> daftarCourse = new ArrayList<>();
        daftarCourse.add(course1);
        daftarCourse.add(new Soal1.Course("Struktur Data", 4, "Pak Made"));
        Student s1 = new Student("Gus Ryan", "2300456", daftarCourse);
        s1.displayStudentInfo();

        // SOAL 4
        System.out.println("\n=== SOAL 4: INHERITANCE & POLYMORPHISM ===");
        Person[] people = {
                new StudentPerson("Gus Ryan", "2300456"),
                new Lecturer("Pak Budi", "19871234")
        };
        for (Person p : people) {
            p.introduce();
        }

        // SOAL 5
        System.out.println("\n=== SOAL 5: ABSTRACT CLASS & INTERFACE ===");
        Exam exam = new Exam("UTS PBO", 85, 0.8);
        Assignment tugas = new Assignment("Tugas Besar", 75, 4);

        System.out.println("Exam Final Score : " + exam.calculateFinalScore() + " | Grade: " + exam.getGrade());
        System.out.println("Assignment Final Score : " + tugas.calculateFinalScore() + " | Grade: " + tugas.getGrade());

        System.out.println("\n===== PROGRAM SELESAI =====");
    }
}
