import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RPSSimplified {

    // runs RPS simplified.
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("datafiles/testinput.txt");
        Scanner fileScanner = new Scanner(file);
        Scanner keyboard = new Scanner(System.in);

        int numTimes = fileScanner.nextInt();
        String nameOfPlayer = fileScanner.next();
        String[] winLossArray = new String[numTimes]; // ["win", "loss", ...] size 5

        // run the game, numTimes.
        runGame(numTimes, keyboard, winLossArray);

        // showResults of the games
        showResults(winLossArray, nameOfPlayer);
    }

    // this method is in charge of running the game the number of times which is
    // specified in the file.
    private static void runGame(int numTimes, Scanner keyboard, String[] winLossArray) {
        for (int i = 0; i < numTimes; i++) {
            String userChoice = keyboard.nextLine();
            // handle the winning cases (pass by value for i)
            int status = handleTieWinLoss(userChoice, winLossArray, i);
            if (status == -1) {
                i--;
            }
        }
    }

    // shows the results of the games. Prints out number of times user won, lost.
    private static void showResults(String[] winLossArray, String name) {
        int winCounter = 0;
        for (int i = 0; i < winLossArray.length; i++) {
            if (winLossArray[i].equals("win")) {
                winCounter++;
            }
        }
        int lossCounter = winLossArray.length - winCounter;
        System.out.println("Name: " + name);
        System.out.println("Num Wins: " + winCounter);
        System.out.println("Num Loss: " + lossCounter);
    }

    // 1. checks the winning conditions and prints out the result
    // 2. adds win, loss to the winLossArray which is used in the showResults method
    // return 1 if the input is valid, -1 if invalid
    private static int handleTieWinLoss(String userChoice, String[] winLossArray, int indexToAdd) {
        if (userChoice.equalsIgnoreCase("S")) {
            System.out.println("Tie");
            // put loss into array
            winLossArray[indexToAdd] = "loss";
        } else if (userChoice.equalsIgnoreCase("R")) {
            System.out.println("Win");
            // put win into array
            winLossArray[indexToAdd] = "win";
        } else if (userChoice.equalsIgnoreCase("P")) {
            System.out.println("Loss");
            // put loss into array
            winLossArray[indexToAdd] = "loss";
        } else {
            System.out.println("Bad choice");
            return -1;
        }
        return 1;
    }
}
