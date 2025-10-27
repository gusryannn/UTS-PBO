package Soal5;

public abstract class Assessment implements Gradable {
    protected String name;
    protected double score;

    public Assessment(String name, double score) {
        this.name = name;
        this.score = score;
    }
}

//Pada soal ini dibuat abstract class Assessment sebagai kerangka dasar yang berisi atribut dan method umum untuk berbagai jenis penilaian, seperti Exam dan Assignment, yang masing-masing memiliki cara berbeda dalam menghitung nilai akhir melalui implementasi method calculateFinalScore(). Selain itu, dibuat interface Gradable dengan method getGrade() untuk menentukan nilai huruf dari hasil penilaian. Abstract class digunakan saat beberapa kelas memiliki struktur dan perilaku yang sama namun perlu implementasi berbeda, sedangkan interface digunakan ketika ingin menetapkan perilaku wajib bagi berbagai kelas tanpa terikat pada pewarisan tertentu.
