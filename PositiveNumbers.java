import java.util.Scanner;

public class PositiveNumbers {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give number pls");
            int userInput = Integer.valueOf(scanner.nextLine());
            if (userInput==0) {
                break;
            }
            if (userInput < 0) {
                System.out.println("Number must be positive");
                continue;

            } else if (userInput > 0) {
                System.out.println("Number is " + userInput);
                continue;

            }


        }

        System.out.println("Well, you've entered zero, completely broken me so congrats the program is over now.");
    }
}