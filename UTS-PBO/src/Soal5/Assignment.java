package Soal5;

public class Assignment extends Assessment {
    private int difficulty;

    public Assignment(String name, double score, int difficulty) {
        super(name, score);
        this.difficulty = difficulty;
    }

    @Override
    public double calculateFinalScore() {
        return score + difficulty;
    }

    @Override
    public String getGrade() {
        return calculateFinalScore() >= 80 ? "A" : "B";
    }
}
