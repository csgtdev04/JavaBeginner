public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello");
//        System.out.print("This is on another line");
//        System.out.print(", but this isn't on another line");
//
////        System.out.print("Hello");
////
////
        String name = "Sai";
        System.out.println("Hello " + name);

        //%s, %f, %d
        System.out.printf("Hello %f, how are you %d\n", 2.31, 7);

        //Static methods (blocks) - organize code, remove redundancy
        printGreeting();
    }

    public static void printGreeting() { //camel case
        System.out.println("Hi, this is a greeting");
        System.out.printf("My name is Sai, how can I help you %s", "sir");
    }
}
