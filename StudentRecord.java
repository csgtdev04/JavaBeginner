import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("datafiles/studentrecords.txt");
        Scanner fileScanner = new Scanner(file);
        String header = fileScanner.nextLine();
        System.out.println(header);

        while (fileScanner.hasNextLine())
        {
            String line = fileScanner.nextLine();
            Scanner lineScanner = new Scanner(line);

            String name = lineScanner.next();
            String grade = lineScanner.next();
            int sat = lineScanner.nextInt();

            System.out.println(name + "\t" + grade + "\t" + sat);
        }
    }
}
