import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a integer: ");
        int userInput = scanner.nextInt();

        System.out.println("You entered: " + userInput);

//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        What happens if you input something that is not an integer?
//        If user inputs anything other than a integer, you will receive a InputMismatchException

        String variable1;
        String variable2;
        String variable3;

        System.out.println("Enter 3 words: ");

        variable1 = scanner.nextLine();
        variable2 = scanner.nextLine();
        variable3 = scanner.nextLine();

        System.out.println("The three words you entered are: ");

        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);

        System.out.println("Enter a sentence: ");
        String userSentence = scanner.nextLine();

        System.out.println(userSentence);

        System.out.println("Enter the length and width of the object: ");
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double area = length * width;
        double perimiter = (length * 2) + (width * 2);

        System.out.println("Area: "+ area);
        System.out.println("Perimeter: "+ perimiter);

    }
}
