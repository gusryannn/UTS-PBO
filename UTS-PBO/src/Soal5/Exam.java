package Soal5;

public class Exam extends Assessment {
    private double weight;

    public Exam(String name, double score, double weight) {
        super(name, score);
        this.weight = weight;
    }

    @Override
    public double calculateFinalScore() {
        return score * weight;
    }

    @Override
    public String getGrade() {
        return calculateFinalScore() >= 75 ? "A" : "B";
    }
}
