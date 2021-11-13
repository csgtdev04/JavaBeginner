public class Building {
    public static void main(String[] args) {
        //ASCII ART
        //size = 6 --> 7 --> 8
        //      X (line 1)
        //     XXX (line 2)
        //    XXXXX
        //   XXXXXXX
        //  XXXXXXXXX
        // XXXXXXXXXXX
        //XXXXXXXXXXXXX

        // go thru the lines (for to loop thru size number of times)
            // on each line, print the spaces (for loop to go thru [formula])
            // on each line, print the xs (for loop to go thru [formula])
            // go to the next line (sout)

        // - rows depend on size
        // - spaces = decreasing
        // - number of Xs increasing

        // y = mx + b <-- equation  of a line

        // y = number of x
        // x = line
        // number of x = m (line) + b

        // y = spaces
        // x = line
        // number of spaces = m (line) + b

        // line = 2; spaces = 4
        // spaces = -1 (line) + b -> 4 = -1 (2) + b --> b = 6
        // When SIZE = 6, spaces = -1 (line) + 6

        // line = 2; x = 3
        // number of x = 2 (line) + b -> 3 = 2 (2) + b --> b = -1
        // When SIZE = 6, number of x = 2 (line) - 1


        // Calculate the spaces and number of x equation when size = 7
        // spaces = -1 (line) + b
        // line = 1; spaces = 6
        // 6 = -1 (1) + b
        // b = 7
        // When SIZE = 7, spaces = -1 (line) + 7
        // number of x = 2 (line) + b
        // line = 1; x = 1
        // 1 =  2 (1) + b
        // b = -1
        // When SIZE = 7, number of x = 2 (line) - 1

        // When SIZE = 6, spaces = -1 (line) + 6
        // When SIZE = 7, spaces = -1 (line) + 7

        // Generalized Eq: spaces = -1 (line) + SIZE

        //                y           = m (x)    + b
        // When SIZE = 6, number of x = 2 (line) - 1
        // When SIZE = 7, number of x = 2 (line) - 1

        // Generalized Eq: number of x = 2 (line) - 1

        // for loop (definite loop)
        // for(start; how long you want to do it; how do you get there)


        // |||||||
        //  |||||
        //   |||
        //    |

        int size = 10;
        for(int line = 1; line <= size; line++) {
            // print out the spaces (-1 (line) + SIZE)
            for(int space = 1; space <= -1 * line + size; space++) {
                System.out.print(" ");
            }
            // print out the x's (2 (line) - 1)
            for(int x = 1; x <= 2 * line - 1; x++) {
                System.out.print("X");
            }
            System.out.println();
        }
        // ...


        for(int line = 1; line <= size; line++){
            for(int space = 1; space <= -1 * line + size; space++) {
                System.out.print(" ");
            }
            for(int x = 1; x <= 2 * line -1; x++) {
                System.out.print("|");
            }
            System.out.println();
        }



    }
}
