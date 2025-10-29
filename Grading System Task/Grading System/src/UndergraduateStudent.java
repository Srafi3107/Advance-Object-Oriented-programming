public class UndergraduateStudent extends Student {
    private double assignmentScore;
    private double midtermScore;
    private double finalExamScore;

    public UndergraduateStudent(String name, String studentId, String department,
                                double assignmentScore, double midtermScore, double finalExamScore) {
        super(name, studentId, department);
        this.assignmentScore = assignmentScore;
        this.midtermScore = midtermScore;
        this.finalExamScore = finalExamScore;
    }

    public double calculateFinalGrade() {
        double grade = assignmentScore * 0.3 + midtermScore * 0.3 + finalExamScore * 0.4;

        if (department.equalsIgnoreCase("CSE")) {
            grade += grade * 0.02;
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
