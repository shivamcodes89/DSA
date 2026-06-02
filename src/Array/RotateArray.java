package Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 8;
        int n = arr.length - 1;
        d = d % arr.length;
        reverse(arr, 0, d-1);
        reverse(arr, d, n);
        System.out.println(Arrays.toString(reverse(arr, 0, n)));
    }
    public static int[] reverse(int[] array, int i, int j){
        while(i < j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }
}
