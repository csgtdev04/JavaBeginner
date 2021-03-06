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
        int personCounter = 1;
        while (fileScanner.hasNextLine()) {
            // do the tasks
            // 1. make a lineScanner
            // - get the line
            String line = fileScanner.nextLine(); // whole line! {Sai   18    UT\n}
            // - make scanner for that line so you can read from that
            Scanner lineScanner = new Scanner(line); // {Sai   18    UT\n}

            // - get specific things from that line
            String name = lineScanner.next(); // {"Sai"}
            int age = lineScanner.nextInt(); // {18}
            String school = lineScanner.next(); // {"UT"}
            // String blankLine = lineScanner.nextLine(); {\n}

            System.out.println("Person " + personCounter + ": " + name + " is " + age + " and " +
                            "goes to " + school);
            personCounter++;
        }


        // WHILE LOOP [happens till condition = false]:
        // we want to read lines from the file until we reach the end...

        // While we don't reach the end of the file, we want to keep reading in lines (when we
        // reach the end we want to stop).
            // For each line, we want to make a lineScanner so we can read in individual tokens.
            // We want to pull / retrieve the specific tokens - name, age, school
        // go till we have a nextLine, we wanna go till hasNextLine is false
    }
}
