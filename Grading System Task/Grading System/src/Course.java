public class Course {
    private String courseCode;
    private String title;
    private Student[] enrolledStudents;

    public Course(String courseCode, String title, Student[] enrolledStudents) {
        this.courseCode = courseCode;
        this.title = title;
        this.enrolledStudents = enrolledStudents;
    }

    public void printGradeReport() {
        System.out.println("Course: " + courseCode + " - " + title);
        System.out.println("---------------------------------------------------------------------------------------------");
        System.out.println("ID\t\t\tName\t\t\tType\t\t\tFinal Grade\t\t\tGrade\t\t\tStatus");
        System.out.println("---------------------------------------------------------------------------------------------");

        double total = 0;
        for (Student s : enrolledStudents) {
            double finalGrade = s.calculateFinalGrade();
            String letter = s.getGradeLetter();
            String status = s.isPassed() ? "Pass" : "Fail";
            total += finalGrade;

            System.out.println(s.studentId + "\t" + s.name + "\t" +
                    s.getClass().getSimpleName() + "\t" + finalGrade + "\t\t" +
                    letter + "\t" + status);
        }

    }
}
