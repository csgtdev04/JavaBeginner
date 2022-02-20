public class Arr {
    public static void main(String[] args) {
        // 0 1 2 3 4 5 6 7 8  ../..... 100
        // 0 0 0 0 0
        // 0 0 0 5 0
        // -1 0 0 5 100

        int[] myIntArr = new int[5];
        myIntArr[3] = 5;
        myIntArr[0] = -1;
        myIntArr[myIntArr.length - 1] = 100; // myIntArr[4] = 100

        //                 0  1  2  3  4    5
        int[] myIntArr2 = {1, 2, 3, 4, 100, 33}; // 1 2 3 4 100 33
        myIntArr2[4] = myIntArr2[5]; // 1, 2, 3, 4, 33, 33

        // Array index out of bounds exception
//        myIntArr[100] = 100;


        double doub[] = new double[4];

        doub[0] =  1.6;
        doub[1] = 4.7;
        doub[2] = 8.2;
        doub[3] = 12.9;

        int j = 0;
        while(j < doub.length){
            System.out.println(doub[j]);
            j++;
        }

        for (int i = 0; i < doub.length; i++) {
            System.out.println(doub[i]);
        }

        System.out.println(doub);



    }
}
