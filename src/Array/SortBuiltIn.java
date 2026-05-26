package Array;

import java.util.Arrays;

public class SortBuiltIn {
    public static void main(String[] args) {
        int[] arr = {2, 0, -3, 6, 4, 7, -4, 8, -2};
//        Arrays.sort(arr);
//        print(arr);
        int[] sorted = returnSorted(arr);
        System.out.println(Arrays.toString(sorted));
    }

//    public static void print(int[] a){
//        for(int i=0; i<a.length; i++){
//            System.out.print(a[i] + " ");
//        }
//    }

    public static int[] returnSorted(int[] a){
        Arrays.sort(a);
        return a;
    }
}