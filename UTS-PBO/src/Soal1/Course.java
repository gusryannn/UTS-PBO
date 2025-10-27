package Soal1;

    public class Course {
        String courseName;
        int credit;
        String instructorName;

        public Course(String courseName, int credit, String instructorName) {
            this.courseName = courseName;
            this.credit = credit;
            this.instructorName = instructorName;
        }

        public void displayInfo() {
            System.out.println("Course Name: " + courseName);
            System.out.println("Credit: " + credit);
            System.out.println("Instructor: " + instructorName);
        }

        public static void main(String[] args) {
            Course c1 = new Course("Pemrograman Berorientasi Objek", 3, "Pak Budi");
            c1.displayInfo();
        }
    }

//jawaban soal 1
// Class merupakan cetak biru (blueprint) atau template yang digunakan untuk membuat objek. Di dalam class terdapat atribut (variabel) dan method (fungsi) yang mendefinisikan perilaku suatu entitas. Sedangkan object adalah instance atau perwujudan nyata dari class yang memiliki nilai pada setiap atributnya.
//Pada contoh di atas, Course adalah class dengan atribut seperti courseName, credit, dan instructorName. Sementara itu, c1 adalah object yang dibuat dari class Course dan berisi data konkret tentang satu mata kuliah.
