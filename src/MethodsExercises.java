import java.util.Scanner;

public class MethodsExercises {
    public static int addNums(int num1, int num2){
        return num1 + num2;
    }
    public static int subtractNums(int num1, int num2){
        return num1 - num2;
    }

    public static int multiplyNums(int num1, int num2){
        return num1 * num2;
    }

    public static void noMultiplyOperator(int num1, int num2){
        int result = 0;
        for (int i = 1; i <= num1; i++){
            result += num2;
        }
        System.out.println(result);
    }

    public static int multiplyWithRecursion(int num1, int num2){
        if(num2 == 0){
            return 0;
        }else{
            return num1 + multiplyWithRecursion(num1, num2 -1);
        }
    }

    public static int divideNums(int num1, int num2){
        return num1/num2;
    }

    public static int remainderOfNums(int num1, int num2){
        return num1 % num2;
    }

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);

        int userInput = sc.nextInt();

        if(userInput >= min && userInput <= max){
            return userInput;
        }
        System.out.println("Number is not between 1-10. Please enter a correct number:");
        return getInteger(min, max);
    }

    public static void factorial(){
        Scanner sc = new Scanner(System.in);
        int userInput;
        String userContinue;

        do{
            long factor = 1;
            String mid = "1";
           userInput = getInteger(1, 10);
           for(int i = 1; i <= userInput; i++){
               if(i>1){
                   mid += "x" + i;
               }
               factor *= i;
               System.out.printf("%d! = %-25s = %d%n", i, mid, factor);
           }
           System.out.println("Do you want to continue? (y/n)");
           userContinue = sc.nextLine();
        } while(userContinue.equalsIgnoreCase("y"));
    }

    public static void diceSimulation(){
        Scanner sc = new Scanner(System.in);
        String rollAgain;
        System.out.println("How many sides do your dice have:");
        int numOfSides = sc.nextInt();
        System.out.println("Would you like to roll your newly created virtual dice? (y/n)");
        String rollOrNot = sc.next();

        if(rollOrNot.equalsIgnoreCase("y")){
            do{
                int dice1 = (int) Math.floor(Math.random() * numOfSides);
                int dice2 = (int) Math.floor(Math.random() * numOfSides);

                System.out.println(dice1);
                System.out.println(dice2);

                System.out.println("Would you like to roll again? (y/n)");
                rollAgain = sc.next();
            }while(rollAgain.equalsIgnoreCase("y"));
        }
    }


    public static void main(String[]args){
        System.out.println(addNums(7, 7));  //14
        System.out.println(subtractNums(9, 8)); //1
        System.out.println(multiplyNums(5, 9));  //45
        noMultiplyOperator(5, 5); //25
        System.out.println(multiplyWithRecursion(2, 3)); //6
        System.out.println(divideNums(56, 8)); //7
        System.out.println(remainderOfNums(8, 2)); //0

        System.out.println("Enter a number between 1 and 10: ");

        factorial();

        diceSimulation();
    }
}
