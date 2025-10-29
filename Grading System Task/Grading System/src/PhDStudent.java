public class PhDStudent extends Student {
    private double publicationScore;
    private double defenseScore;

    public PhDStudent(String name, String studentId, String department,
                      double publicationScore, double defenseScore) {
        super(name, studentId, department);
        this.publicationScore = publicationScore;
        this.defenseScore = defenseScore;
    }

    public double calculateFinalGrade() {
        double grade = publicationScore * 0.7 + defenseScore * 0.3;


        if (publicationScore >= 95) {
            grade += 5;
        }

        return Math.min(grade, 100);
    }

    public String getGradeLetter() {
        double g = calculateFinalGrade();
        if (g >= 90) return "A+";
        else if (g >= 85) return "A";
        else if (g >= 80) return "B";
        else if (g >= 70) return "C";
        else return "F";
    }
}
