import java.util.Locale;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args){

        boolean runProgram = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Talk to Bob, type something to spark up a conversation with him. (Type goodbye to exit)");

        do {
            String userInput = scanner.nextLine();
            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.endsWith(" ")) {
                System.out.println("Fine. Be that way!");
            } else if(userInput.equalsIgnoreCase("goodbye")){
                System.out.println("Goodbye!");
                runProgram = false;
            }else{
                System.out.println("Whatever");
            }
        }while(runProgram);
    }
}
