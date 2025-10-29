public abstract class Student {
    protected String name;
    protected String studentId;
    protected String department;

    public Student(String name, String studentId, String department) {
        this.name = name;
        this.studentId = studentId;
        this.department = department;
    }

    public abstract double calculateFinalGrade();
    public abstract String getGradeLetter();

    public boolean isPassed() {
        return calculateFinalGrade() >= 60;
    }

    public String toString() {
        return studentId + "\t" + name + "\t" + getClass().getSimpleName();
    }
}
