import java.util.Scanner;

import java.text.DecimalFormat;

public class ControlFlowExercises {
    public static void main(String[] args){
//1. Loop Basics - a. While
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

//1. Loop Basics - b. Do while
//        int num = 0;
//        do {
//            System.out.println(num);
//            num += 2;
//        } while (num <= 100);
// Iterates from 0 - 100 by 2

// 2nd part of b. Do while
//        int num = 100;
//         do {
//            System.out.println(num);
//            num -= 5;
//        } while (num >= -10);
//Iterates from 100 - (-10) by 5

// 3rd part of b. Do while
//        int num = 2;
//        do {
//            System.out.println(num);
//            num = (int) Math.pow(num, 2);
//        } while (num <= 1000000);
//Iterates from two to a million by each line squared

//Refactoring above code with for loops

//        for(int num = 0; num <=100; num += 2) {
//            System.out.println(num);
//        }
//Iterates from 0 - 100 by 2

//        for(int num = 100; num >= -10; num -= 5) {
//            System.out.println(num);
//        }
//Iterates from 100 - (-10) by 5

//        for(int num = 2; num <= 1000000; num = (int) Math.pow(num, 2)) {
//            System.out.println(num);
//        }

//        for(long num = 2; num < 1000000; num *= num){
//            System.out.println(num);
//        }
//Another way to solve
//Iterates from 2 to 1000000 by squares

//2. Fizzbuzz
//        for(int i = 1; i <= 100; i++){
//            if (((i % 3) == 0) && ((i % 5) == 0)) // Multiple of 3 & 5
//                System.out.println("FizzBuzz");
//            else if ((i % 3) == 0) // Multiple of 3
//                System.out.println("Fizz");
//            else if ((i % 5) == 0) // Multiple of 5
//                System.out.println("Buzz");
//            else
//                System.out.println(i); // Not a multiple of 3 or 5
//        }

//3. Display a table of powers
        Scanner scanner =  new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0");

        boolean userContinue = true;

        while (userContinue) {
            System.out.println("Enter a number");
            int userInput = scanner.nextInt();

            System.out.println("Here is your table!");
            System.out.println();
            System.out.println("number  | squared   | cubed");
            System.out.println("------- | --------- | -----");
            for(int num = 1; num <= userInput; num++){
                System.out.println(df.format(Math.pow(num,1)) + "\t\t| " + df.format(Math.pow(num, 2)) + " \t\t| " + df.format(Math.pow(num, 3)));
            }
            System.out.println("Do you want to enter a new number");
            userContinue = scanner.nextBoolean();
        }

//4. Convert number to letter grades

        String continueChoice = "y";
        while (continueChoice.equalsIgnoreCase("y"))
        {
            //get user input
            System.out.print("Enter Numeric Grade:\t\t");
            double score = scanner.nextDouble();

            //converts users numeric grade into letter grade
            char userGrade = 'F';
            if(score >= 88)
                userGrade = 'A';
            else if(score >= 80)
                userGrade = 'B';
            else if (score >= 67)
                userGrade = 'C';
            else if (score >= 60)
                userGrade = 'D';

            // display conversion result
            System.out.println("Equivalent Letter Grade:\t" + userGrade);

            //Checks to see if user wants to continue
            System.out.print("\nContinue? (y/n):\t\t");
            continueChoice = scanner.next();
            System.out.println();
        }//end while loop

    }
}
