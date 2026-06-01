package Array;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] arr = {2,5,7,0,-1,3};
        for(int num : arr){
            num *= 2;
        }
        System.out.println(Arrays.toString(arr)); // [2, 5, 7, 0, -1, 3]
    }
}
