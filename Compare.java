import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        // comparing primitive types -> == [int, double, char]
        System.out.println(1 == 2); // false
        System.out.println(2 == 2); // true
        System.out.println(1.2 == 1.3); // false
        System.out.println(2.9 == 2.9);// true

        System.out.println('a' == 'a'); // true (97 == 97)
        System.out.println('a' == 'b'); // false (97 == 98)
        System.out.println('a' == 'A'); // false (97 == 65)

        System.out.println('3' == 3); // false (51 == 3)
        System.out.println('3' == 51); // (51 ==  51) - true

        // comparing reference types -> .equals() [String, Input, Scanner, Graphics,
        // DrawingPanel, Date]
        // reference type has many features
        // String is a special reference type

        String a = "Sai";
        String b = "Sai1";
        System.out.println(a.equals(b)); // true - .equals compares the content in the string
        System.out.println(a == b); // compares the OBJECTS themselves

        // HW: Finish RPS project - Last class
        // Finish talking about comparisons
        // Scanners and next(), nextInt(), nextLine().
    }
}
