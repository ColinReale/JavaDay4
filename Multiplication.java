import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        // Create the Scanner for reading user input
        Scanner scanner = new Scanner(System.in);


            System.out.println("Give number pls");
            int userInput = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < 11; i++) {
            String stringer = String.valueOf(userInput);
            String stringI = String.valueOf(i);
            System.out.println(stringer + "x" + stringI + "=" + i*userInput);
        }

            }

    }
