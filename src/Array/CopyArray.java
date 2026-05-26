package Array;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};

        // copy with method
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(arr2));
        System.out.println();

        // copy without method
        int[] arr3 = new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }
        for(int i=0; i<arr3.length; i++){
            System.out.print(arr3[i] + " ");
        }
    }
}
