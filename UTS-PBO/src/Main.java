public class Main {
    public static void main(String[] args) {

        System.out.println("=== SOAL 1: CLASS & OBJECT ===");
        Soal1.Course course1 = new Soal1.Course("Pemrograman Berorientasi Objek", 3, "Pak Budi");
        course1.displayInfo();

        System.out.println("\n=== SOAL 2: ENCAPSULATION ===");
        Soal2.Course course2 = new Soal2.Course("Basis Data", -2, "Bu Ayu");
        course2.displayInfo();
        course2.setCredit(4);
        System.out.println("Setelah diperbaiki:");
        course2.displayInfo();

        System.out.println("\n=== SOAL 3: RELATIONSHIP (AGGREGATION) ===");
        java.util.List<Soal1.Course> daftarCourse = new java.util.ArrayList<>();
        daftarCourse.add(course1);
        daftarCourse.add(new Soal1.Course("Struktur Data", 4, "Pak Made"));
        Soal3.Student s1 = new Soal3.Student("Gus Ryan", "2300456", daftarCourse);
        s1.displayStudentInfo();

        System.out.println("\n=== SOAL 4: INHERITANCE & POLYMORPHISM ===");
        Soal4.Person[] people = {
                new Soal4.StudentPerson("Gus Ryan", "2300456"),
                new Soal4.Lecturer("Pak Budi", "19871234")
        };
        for (Soal4.Person p : people) {
            p.introduce();
        }

        System.out.println("\n=== SOAL 5: ABSTRACT CLASS & INTERFACE ===");
        Soal5.Exam exam = new Soal5.Exam("UTS PBO", 85, 0.8);
        Soal5.Assignment tugas = new Soal5.Assignment("Tugas Besar", 75, 4);
        System.out.println("Exam Final Score : " + exam.calculateFinalScore() + " | Grade: " + exam.getGrade());
        System.out.println("Assignment Final Score : " + tugas.calculateFinalScore() + " | Grade: " + tugas.getGrade());

        System.out.println("\n===== PROGRAM SELESAI =====");
    }
}
