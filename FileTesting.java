import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTesting {
    public static void main(String[] args) throws FileNotFoundException {
        /*
            Sai   18    UT
            Sumanth  14   Heritage
            Immanuel  14  NewTech
            Hannah  16  CHS

            HW: Take the file and convert into what the computer understands.
         */

        // 1. read in the file
        // - create the file object (accessing it/locating it)
        File file = new File("datafiles/data.txt");

        // - read in the file using a scanner (transferring the file for reading purposes)
        Scanner fileScanner = new Scanner(file); // lets us look through our file

        // 2. analyze the file...
        // in order to print the data, we need to go through the data

        // - get the line
        String firstLine = fileScanner.nextLine(); // whole line! {Sai   18    UT\n}

        // Sai   18    UT
        // - make scanner for that line so you can read from that
        Scanner lineScanner = new Scanner(firstLine); // {Sai   18    UT\n}

        // - get specific things from that line
        String name = lineScanner.next(); // {"Sai"}
        int age = lineScanner.nextInt(); // {18}
        String school = lineScanner.next(); // {"UT"}
        // String blankLine = lineScanner.nextLine(); {\n}

        // - print in a readable way
        System.out.println(name + " is " + age + " and goes to " + school);

        // WHILE LOOP [happens till condition = false]:
        // we want to read lines from the file until we reach the end...

        // While we don't reach the end of the file, we want to keep reading in lines (when we
        // reach the end we want to stop).
            // For each line, we want to make a lineScanner so we can read in individual tokens.
            // We want to pull / retrieve the specific tokens - name, age, school

    }
}
