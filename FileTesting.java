import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTesting {
    public static void main(String[] args) throws FileNotFoundException {
        // 1. read in the file
        // - create the file object (accessing it/locating it)
        File file = new File("datafiles/data.txt");

        // - read in the file using a scanner (transferring the file for reading purposes)
        Scanner fileScanner = new Scanner(file); // lets us look through our file

        // 2. analyze the file...
        // in order to print the data, we need to go through the data

        // - get the line
        String firstLine = fileScanner.nextLine(); // whole line!

        // Sai   18    UT
        // - make scanner for that line so you can read from that
        Scanner lineScanner = new Scanner(firstLine);

        // - get specific things from that line
        String name = lineScanner.next();
        int age = lineScanner.nextInt();
        String school = lineScanner.next();

        // - print in a readable way
        System.out.println(name + " is " + age + " and goes to " + school);

        // WHILE LOOP [happens till condition = false]:
        // we want to read lines from the file until we reach the end...
    }
}
