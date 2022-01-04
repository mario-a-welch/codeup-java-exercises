import java.util.Scanner;

public class Warmups {
    public static void main(String[] args) {
        String myString = "Java is statically typed, while Javascript is dynamically typed.";
        System.out.println(myString);

        Scanner scanner = new Scanner(System.in);

        System.out.println("What did you eat for breakfast today?");
        String userBreakfast = scanner.nextLine();

        System.out.println("Thanks for telling me you ate: " + userBreakfast);

        System.out.println(startDay());
    }

    public static String startDay(){
        return "Brain loading... Done!";
    }
}
