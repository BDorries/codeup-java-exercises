package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Student mark = new Student("Mark");
        Student martha = new Student("Martha");
        Student mary = new Student("Mary");
        Student marcus = new Student("Marcus");

        setRandomGrades(mark);
        setRandomGrades(martha);
        setRandomGrades(mary);
        setRandomGrades(marcus);

        mark.setGitName("DarkMark");
        martha.setGitName("MarsMartha");
        mary.setGitName("MerryMary");
        marcus.setGitName("MightyMarcus");

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(mark);
        studentList.add(martha);
        studentList.add(mary);
        studentList.add(marcus);
        String userNames = getUsernameString(studentList);

        HashMap<String, Student> students = new HashMap<>();
        students.put(mark.getGitName(), mark);
        students.put(martha.getGitName(), martha);
        students.put(mary.getGitName(), mary);
        students.put(marcus.getGitName(), marcus);

        while(true){

            writeMenu(userNames);
            Scanner scan = new Scanner(System.in);
            String searchFor = scan.nextLine();
            if (searchFor.equals("quit")){
                System.out.println("Good. Don't bother me anymore.");
                break;
            }
            String notFound = "Learn to read, fool. There is no one with that username.";
            try{
                Student result = students.get(searchFor);
                System.out.println(result.toString());
            }catch (NullPointerException e){
                System.out.println(notFound);
            }
        }
    }
    public static String getUsernameString(ArrayList<Student> studentList){
        StringBuilder str = new StringBuilder();

        for (Student student : studentList) {
            str.append("|");
            str.append(student.getGitName());
            str.append("| ");
        }

        return str.toString();
    }

    public static void writeMenu(String names){
        System.out.printf("""
                Here's some names.
                %s
                What else do you want? Or can I go back to bed now?
                If you wanna know more about these creeps, tell me who you want to look at.
                """,names);
    }
    public static void setRandomGrades (Student student){
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            student.addGrade(rand.nextInt(60,100));
        }
    }
}
