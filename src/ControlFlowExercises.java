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
//        double num = 2;
//        do {
//            System.out.println(num);
//            num = Math.pow(num, 2);
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

//        for(double num = 2; num <= 1000000; num = Math.pow(num, 2)) {
//            System.out.println(num);
//        }
//Iterates from 2 to 1000000 by squares

//2. Fizzbuzz
        for(int i = 1; i <= 100; i++){
            if (((i % 3) == 0) && ((i % 5) == 0)) // Multiple of 3 & 5
                System.out.println("FizzBuzz");
            else if ((i % 3) == 0) // Multiple of 3
                System.out.println("Fizz");
            else if ((i % 5) == 0) // Multiple of 5
                System.out.println("Buzz");
            else
                System.out.println(i); // Not a multiple of 3 or 5
        }

    }
}
