package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private String gitName;
    private ArrayList<Integer> grades;

    public Student(String name){

        this.name = name;
        grades = new ArrayList<>();
    }

    @Override
    public String toString(){
        return String.format("""
                Name: %s
                GitHub Username: %s
                Grade Average: %f
                """,this.name,this.gitName,this.getGradeAverage());
    }

    public String getName(){
        return name;
    }
    public String getGitName(){
        return gitName;
    }
    public void setGitName(String gitName){
        this.gitName = gitName;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum/grades.size();
    }
}
