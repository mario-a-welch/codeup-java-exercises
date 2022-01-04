import java.util.Scanner;

public class HighLow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to my number guessing game! Lets Play!!!");
        int randomNumber = (int)Math.floor(Math.random() * 100);
        int userInput;

        System.out.println("Guess the number!");

        do{
            System.out.println("Choose a number between 1-100!");
            userInput = sc.nextInt();

            if(userInput > randomNumber){
                System.out.println("LOWER");
            }else if(userInput < randomNumber){
                System.out.println("Higher");
            }else{
                System.out.println("GOOD GUESS!");
                System.out.println("The number " +userInput+ " is correct!");
            }
        }while(userInput != randomNumber);
    }
}
