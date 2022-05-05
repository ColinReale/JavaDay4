import java.util.Scanner;

public class CountToEleven {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);


            System.out.println("Give number less than 11 pls");
            int userInput = Integer.valueOf(scanner.nextLine());
            while (userInput < 12) {
                System.out.println(userInput);
                userInput++;

            }

    }
}