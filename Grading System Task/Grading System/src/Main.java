public class Main {
    public static void main(String[] args) {

        Student s1 = new UndergraduateStudent("Iftear Faisal", "E101", "EEE", 30, 25, 15);
        Student s2 = new GraduateStudent("Rakin Al Hamid", "C302", "CIVIL", 92, 80, 85);
        Student s3 = new PhDStudent("Dr. Daiyan Harun", "CS501", "CSE", 96, 88);

        Student[] students = { s1, s2, s3 };

        Course course = new Course("CSE505", "Advanced Programming Paradigms", students);
        course.printGradeReport();
    }
}
