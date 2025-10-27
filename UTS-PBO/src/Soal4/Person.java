package Soal4;

public class Person {

        protected String name;
        public Person(String name) {
            this.name = name;
        }

        public void introduce() {
            System.out.println("Saya adalah seseorang bernama " + name);
        }
    }

    class Student extends Person {
        private String studentId;

        public Student(String name, String studentId) {
            super(name);
            this.studentId = studentId;
        }

        @Override
        public void introduce() {
            System.out.println("Saya mahasiswa bernama " + name + " dengan NIM " + studentId);
        }
    }

    class Lecturer extends Person {
        private String nidn;

        public Lecturer(String name, String nidn) {
            super(name);
            this.nidn = nidn;
        }

        @Override
        public void introduce() {
            System.out.println("Saya dosen bernama " + name + " dengan NIDN " + nidn);
        }
    }

    class MainTest {
        public static void main(String[] args) {
            Person[] people = {
                    new Student("Gus Ryan", "2300456"),
                    new Lecturer("Pak Budi", "19871234")
            };

            for (Person p : people) {
                p.introduce();
            }
        }
    }

    //Polymorphism (banyak bentuk) ditunjukkan ketika array Person[] berisi objek Student dan Lecturer, tetapi ketika method introduce() dipanggil, sistem akan mengeksekusi versi yang sesuai dengan tipe objek sebenarnya. Konsep ini memungkinkan satu interface digunakan untuk berbagai bentuk objek secara fleksibel.

