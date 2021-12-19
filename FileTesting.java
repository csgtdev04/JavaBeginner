import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTesting {
    public static void main(String[] args) throws FileNotFoundException {
        // 1. read in the file
        // - create the file
        File file = new File("data.txt"); // represent our data.txt (tells our java file that
        // another file with the name data.txt exists)

        // - read in the file using a scanner
        Scanner fileScanner = new Scanner(file); // lets us look through our file

        // 2. analyze the file...
        // in order to print the data, we need to go through the data

        // - get the line
        String firstLine = fileScanner.nextLine();

        // - make scanner for that line so you can read from that
        Scanner lineScanner = new Scanner(firstLine);

        // - get specific things from that line
        String name = lineScanner.next();
        int age = lineScanner.nextInt();
        String school = lineScanner.next();

        // - print in a readable way
        System.out.println(name + " is " + age + " and goes to " + school);


    }
}
