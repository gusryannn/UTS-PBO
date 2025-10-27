package Soal2;

public class Course {
        private String courseName;
        private int credit;
        private String instructorName;

        public Course(String courseName, int credit, String instructorName) {
            setCredit(credit);
            this.courseName = courseName;
            this.instructorName = instructorName;
        }

        public int getCredit() {
            return credit;
        }

        public void setCredit(int credit) {
            if (credit >= 0) {
                this.credit = credit;
            } else {
                System.out.println("Credit tidak boleh negatif!");
                this.credit = 0;
            }
        }

        public void displayInfo() {
            System.out.println("Course: " + courseName + " | Credit: " + credit + " | Instructor: " + instructorName);
        }
    }

    //Encapsulation adalah konsep dalam OOP yang digunakan untuk melindungi data agar tidak diakses atau diubah secara langsung dari luar class. Prinsip ini diterapkan dengan menjadikan atribut bersifat private dan menyediakan akses melalui getter dan setter. Pada contoh di atas, atribut credit dibuat private dan hanya dapat diubah melalui method setCredit(). Di dalam setter juga terdapat validasi agar nilai credit tidak bisa negatif.
   //Encapsulation penting karena dapat menjaga keamanan dan konsistensi data, menghindari perubahan yang tidak diinginkan, serta memisahkan detail implementasi internal dari akses luar class.




