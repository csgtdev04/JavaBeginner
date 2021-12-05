import java.util.Random;
import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // 1
        int a = 2;
        // Simplify our if statements - TERNARY OPERATION
        // [Boolean expression] ? [what should the true do] : [what should the false do]
        // Print out "Hi" if a > 5, otherwise print out "Bye"
        System.out.println(a > 5 ? "Hi" : "Bye"); // 2

        String userChoice = getUserChoice(scanner); // 4 (methods: void, return)
        System.out.println("User chose " + userChoice.toUpperCase()); // 3
        String computerChoice = getComputerChoice(random);
        System.out.println("Computer chose " + computerChoice.toUpperCase());

        int winner = checkIfUserWon(userChoice, computerChoice);
        // winner == 1 is user won
        // winner == -1 is user lost
        printUserStatus(winner);
    }

    public static void printUserStatus(int winner) {
        if (winner == 0) {
            System.out.println("DRAW!");
            return; // (empty return)
        }
        System.out.println(winner == 1 ? "You won!" : "You lost!");
    }

    public static int checkIfUserWon(String userChoice, String computerChoice) {
        // rock beats scissors
        // paper beats rock
        // scissors beats paper
        int winner = -1; // user is not a winner
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            winner = 0;
        }

        // equalsIgnoreCase / flags (5)
        if (userChoice.equalsIgnoreCase("rock") &&
                computerChoice.equalsIgnoreCase("scissors")) {
            winner = 1; // user is a winner
        } else if (userChoice.equalsIgnoreCase("paper") &&
                        computerChoice.equalsIgnoreCase("rock")) {
            winner = 1;
        } else if (userChoice.equalsIgnoreCase("scissors") &&
                        computerChoice.equalsIgnoreCase("paper")) {
            winner = 1; // one sounds like "won"
        }
        return winner;
    }

    public static String getComputerChoice(Random random) {
        // Generate random number ->
        // 0 -> Rock
        // 1 -> Paper
        // 2 -> Scissors
        // 6 (generating random numbers)
        int randomNumber = random.nextInt(3); // 0 -> 2
        String computerChoice = "Scissors";

        if (randomNumber == 0) {
            computerChoice = "Rock";
        } else if (randomNumber == 1) {
            computerChoice = "Paper";
        }

        return computerChoice;
    }

    // void methods, scope is limited, the result can't be accessed in main
    // return type methods: must return the type specified, will be accessible in main
    public static String getUserChoice(Scanner scanner) {
        System.out.print("Enter your choice: ");
        String userChoice = scanner.next();
        return userChoice;
    }
}
