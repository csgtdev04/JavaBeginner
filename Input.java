import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // in order to interact, add input, we use Scanner
        int a = 5;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your age? ");
        int userAge = keyboard.nextInt();


        // after using nextInt(), just remember to call nextLine() after
        keyboard.nextLine();

        System.out.print("What is your name? ");
        String userName = keyboard.nextLine();

        System.out.println("Hey " + userName + ". Your age is " + userAge);

        // RPS

        if (userAge > 20) {
            System.out.println("You can play RPS 2 times");
        } else if (userAge > 17) {
            System.out.println("You can play RPS");
        } else {
            System.out.println("Too young");
        }



    }
}
