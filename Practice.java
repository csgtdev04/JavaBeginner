public class Practice {
    public static void main(String[] args) {
        // Simplify our if statements - TERNARY OPERATION
        // [Boolean expression] ? [what should the true do] : [what should the false do]
        // Print out "Hi" if a > 5, otherwise print out "Bye"
        int a = 6;
        System.out.println(a > 5 ? "Hi" : "Bye"); // 2

        String b = "hi";
        String c = "hi2";
        System.out.println(b.equalsIgnoreCase(c) ? "Same" : "Not Same");

        int age = 20;
        int company = 35;
        System.out.println(company > age ? "The company is old" : "The company is relatively new");

        int i = 52;
        char c1 = '4'; // 52

        System.out.println("Is " + c + " the same as " + i + "?");
        System.out.println(c1 == i ? "Yes" : "No");

    }
}
