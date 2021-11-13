public class Test {
    public static void main(String[] args) {
        // Test1

        // printf statements (%d, %s, %f)
        //1. Print out an int, double, and string separated by commas
        int a = 10;
        double b = 12.0;
        String c = "hello";
        System.out.printf("%d, %f, %s", a, b, c);
        System.out.println();
        //2. Print out the double 78.634 rounded to the nearest tenth w/ a percentage symbol after
        double num = 78.634;
        System.out.printf("%.1f%%", num);
        System.out.println();

        //Question 1:
        // Answer here
        //Question 2:
        // Answer here

        // ASCII structure printing -> print it out
        // Print out the following structure

        // Formulas:
        // dots = -1 (line) + b
        // stars = 1 (line) + b

        // when size = 2
        // line = 2
        // 2 = -1 (2) + b
        // b = 4
        // dots = -1 (line) + 4

        // when size = 3
        // line = 3
        // 6 = -1 (3) + b
        // b = 9
        // dots = -1 (line) + 9

        // dots = -1 (line) + (size * size)

        // when size = 2
        // line = 2
        // 2 = 1 (2) + b -> b = 0
        // stars = 1 (line) + 0

        // when size = 3
        // line = 3
        // 3 = 1 (3) + b - > 0
        // stars = 1 (line) + 0

        // stars = 1 (line)

        // When SIZE = 1
        // Output:
        // *

        // When SIZE = 2
        // Output:
        // ...*
        // ..**
        // .***
        // ****

        // When SIZE = 3
        // Output:
        // ........*
        // .......**
        // ......***
        // .....****
        // ....*****
        // ...******
        // ..*******
        // .********
        // *********

        // Hint: think about relationships between the line number, size, and dots / stars

        // dots = -1 (line) + (size * size)
        // stars = 1 (line)
        // lines = (size * size)

        int size = 6;
        int numLines = size * size;
        for(int line = 1; line <= numLines; line++) {
            // print dots
            int numDots = -1 * (line) + (size * size);
            for(int dot = 1; dot <= numDots; dot++) {
                System.out.print(".");
            }
            // print stars
            int numStars = 1 * (line);
            for(int star = 1; star <= numStars; star++) {
                System.out.print("*");
            }
            System.out.println();
        } // nested for loop

        // Operations
        // 2 + 3 + "hello" = "5hello"
        // "hello" + 2 + 3 = "hello23"
        // 45 % 6.0 * 2 + "Hello" + 2 + 3.0 = "6.0Hello23.0"
        // "hello" + 2 / 3.0 = "hello0.66"



    }
}
