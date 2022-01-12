package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args){
        //Creates HashMap named students
        HashMap<String, Student> students = new HashMap<>();


        //4 student objects
        Student mario =  new Student("Mario");
        Student maverick =  new Student("Maverick");
        Student alexis =  new Student("Alexis");
        Student keith =  new Student("Keith");

        students.put("Mwelch123", mario);
        students.put("LoneMaverick25", maverick);
        students.put("LexiDaBesti", alexis);
        students.put("KeiferOne", keith);

        //Gives 4 Grades to mario object
        mario.addGrade(100);
        mario.addGrade(100);
        mario.addGrade(90);
        mario.addGrade(70);

        ////Gives 4 Grades to maverick object
        maverick.addGrade(100);
        maverick.addGrade(100);
        maverick.addGrade(100);
        maverick.addGrade(100);

        //Gives 4 Grades to alexis object
        alexis.addGrade(80);
        alexis.addGrade(80);
        alexis.addGrade(80);
        alexis.addGrade(80);

        ////Gives 4 Grades to keith object
        keith.addGrade(70);
        keith.addGrade(90);
        keith.addGrade(60);
        keith.addGrade(20);

        //Command line Interface
        Scanner scanner = new Scanner(System.in);

        boolean continueInterface;

        System.out.println("Welcome!");
        System.out.println("");

        do{
            System.out.println("Here are the GitHub usernames of our students:");
            System.out.println(" ");
            String gitHubUsers = "";

            //Iterates through students hashmap and prints out key value with space between
            for(String gitHubNames : students.keySet()){
                gitHubUsers += gitHubNames + " ";
            }
            System.out.println(gitHubUsers);

            System.out.println("");
            System.out.println("What student would you like to see more information on?");

            String userInput = scanner.nextLine();

            Student result = students.get(userInput);

            if(result == null){
                System.out.printf("Sorry, no student found with the GitHub username of %s%n", userInput);
            }else{
                System.out.println("User Found");
                System.out.printf("Name: %s - GitHub Username: %s - Current Average: %s%n", result.getName(), userInput, result.getGradeAverage());
            }

            //Ask user if they want to continue and ends Interface if they choose no
            System.out.println("Do you want to see another student? (yes/no)");

            String userContinue = scanner.nextLine();

            if(userContinue.equalsIgnoreCase("yes")){
                continueInterface = true;
            } else{
                System.out.println("Goodbye, and have a wonderful day!");
                continueInterface = false;
            }
        }while(continueInterface);

    }
}
