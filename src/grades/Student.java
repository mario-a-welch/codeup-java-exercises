package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    //Constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;

        for(int grade : this.grades){
            total += grade;
        }
        return total / this.grades.size();
    }

    public static void main(String[] args){
//        Student mario = new Student("Mario");
//        Student maverick = new Student("Maverick");
//
//        mario.addGrade(100);
//        mario.addGrade(80);
//        mario.addGrade(90);
//
//        maverick.addGrade(100);
//        maverick.addGrade(100);
//        maverick.addGrade(100);
//
//        System.out.println("Mario's Grades: " + mario.grades);
//        System.out.println("Mario's Average: " + mario.getGradeAverage());
//
//        System.out.println("Maverick's Grades: " + maverick.grades);
//        System.out.println("Maverick's Average: " + maverick.getGradeAverage());

    }
}
