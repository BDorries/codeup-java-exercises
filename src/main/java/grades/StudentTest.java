package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student mark = new Student("Mark");
        Student martha = new Student("Martha");
        Student mary = new Student("Mary");

        mark.addGrade(69);
        mark.addGrade(80);
        mark.addGrade(90);
        mark.addGrade(33);

        System.out.println(mark.getGradeAverage());
    }
}
