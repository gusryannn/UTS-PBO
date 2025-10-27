package Soal5;

public abstract class Assessment {
    protected String title;
    protected double score;

    public Assessment(String title, double score) {
        this.title = title;
        this.score = score;
    }

    public abstract double calculateFinalScore();
}

interface Gradable {
    String getGrade();
}

class Exam extends Assessment implements Gradable {
    private double weight;

    public Exam(String title, double score, double weight) {
        super(title, score);
        this.weight = weight;
    }

    @Override
    public double calculateFinalScore() {
        return score * weight;
    }

    @Override
    public String getGrade() {
        double finalScore = calculateFinalScore();
        return finalScore >= 80 ? "A" :
                finalScore >= 70 ? "B" :
                        finalScore >= 60 ? "C" : "D";
    }
}

class Assignment extends Assessment implements Gradable {
    private int difficultyLevel;

    public Assignment(String title, double score, int difficultyLevel) {
        super(title, score);
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public double calculateFinalScore() {
        return score + (difficultyLevel * 2);
    }

    @Override
    public String getGrade() {
        double finalScore = calculateFinalScore();
        return finalScore >= 85 ? "A" :
                finalScore >= 70 ? "B" : "C";
    }
}

//Interface digunakan untuk menentukan perilaku yang wajib dimiliki oleh class tanpa memaksa hubungan pewarisan langsung. Interface Gradable memiliki method getGrade() yang diimplementasikan oleh kedua subclass.
//Secara umum, abstract class digunakan jika beberapa class memiliki kesamaan struktur atau perilaku dasar, sedangkan interface digunakan jika beberapa class yang tidak saling berhubungan perlu memiliki perilaku yang sama.


