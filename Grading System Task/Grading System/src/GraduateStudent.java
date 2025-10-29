public class GraduateStudent extends Student {
    private double projectScore;
    private double examScore;
    private double participationScore;

    public GraduateStudent(String name, String studentId, String department,
                           double projectScore, double examScore, double participationScore) {
        super(name, studentId, department);
        this.projectScore = projectScore;
        this.examScore = examScore;
        this.participationScore = participationScore;
    }

    public double calculateFinalGrade() {
        double grade = projectScore * 0.5 + examScore * 0.4 + participationScore * 0.1;

        if (projectScore >= 90) {
            grade += grade * 0.05;
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
