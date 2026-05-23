package Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        // basic and different variable store one value
        int a = 1, b = 2, c = 3, d = 4;

        //  Multiple element store int one variable
        int[] arr1 = {1, 2, 3, 4, 5};  // declaration & Initialization

        // print arr1 using loop
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println(); // for next line

        // print arr1 using built in method
        System.out.println(Arrays.toString(arr1)); // for using this import Arrays

//____________________________________________________________________________________________

        Scanner sc = new Scanner(System.in);

        int[] arr2 = new int[5]; // only declaration

//        // fill element using loop
//        for(int i=0; i<arr2.length; i++){
//            arr2[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr2));
        //+++++++++++++++++++++++++++++++++++++++++++

        // fill element using method
        int[] arr3 = new int[4];
        Arrays.fill(arr3, 8);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = new int[6];
        Arrays.fill(arr4, 1, 4, 7);
        System.out.println(Arrays.toString(arr4));


        // @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        // updating Array
        arr1[0] = 5;
        arr1[1] = 5;
        arr1[2] = 5;
        arr1[3] = 5;
        System.out.println(Arrays.toString(arr1));
    }
}
