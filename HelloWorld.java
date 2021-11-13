public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.print("This is on another line");
//        System.out.print(", but this isn't on another line");

//        System.out.print("Hello");
//
//
//        printf2();
        System.out.printf("%,d\n", 1000000);
        questionAboutPrintf();

        String name = "Sai";
        System.out.println("Hello " + name);
        System.out.printf("Hello %s\n", name);

        //escape sequences
        System.out.println("Hello\nSai");
        //Hello
        //Sai

        //%s, %f, %d
        //2.310000
        //%.1f = rounded to the tenths place
        //%.2f = rounded to the hundredths place
        System.out.printf("Hello %.2f, how are you %d\n", 2.31, 7);

        //Problem: to print out a decimal number rounded to the thousandths place and
        //print out a whole number afterwards (same printf statement); use escape sequence \n
        System.out.printf("%.3f\n%d\n", 4.55323, 2);
        //4.553
        //2
        //....
        System.out.println("this is after the printf statement");

        //Static methods (blocks) - organize code, remove redundancy
        printGreeting();
    }

    public static void printGreeting() { //camel case
        System.out.println("Hi, this is a greeting");
        System.out.printf("My name is Sai, how can I help you %s", "sir");
    }

    public static void printf2() {
        int num1 = 5;
        int num2 = 10;
        double num3 = 3;
        System.out.println(num3);
        // can't demote a double to an int
        // double occupy 8 bytes in memory
        // int occupy 4 bytes in memory
//        println() - prints whatever is in the () and goes to the next line
        //print - prints whatever is in the ()
        //printf - prints whatever is in the ()

        System.out.printf("Hello %d %d %.1f\n", num1, num2, num3);
        System.out.print("Hello " + "Sai");
        System.out.printf("Hello Sai");

        // print out 2 ints and 2 double and round the first double to the tenths place and the
        // 2nd double to the thousandths place
        // make sure you go to the next line
    }

    public static void questionAboutPrintf() {
        // %d = int (placeholder)
        // %s = string (words)
        // %f = double (decimals) - %.1f - round the tenths place
        // %% = %
        // %,d = adds commas to your integer number (1,000)
        int num1=18;
        int num2= 7;
        double num3= 11.987; //11.0
        double num4= 20; //20.0 -> 20.000
        String name = "Sai";

        System.out.printf("Hello my name, is %s. My age, is %d. My double val is %.1f\n", name,
                num1, num3);
        System.out.printf("%d, %d, %.1f, %.3f\n", num1, num2, num3, num4);
        System.out.printf("");
    }
}
