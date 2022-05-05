import java.util.Scanner;

public class StopAtFive {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give number pls");
            String userInput = scanner.nextLine();
            if (userInput.equals("5")) {
                break;
            }


        }

        System.out.println("FINALLY you gave me a five! Was that really so hard lol");
    }
}