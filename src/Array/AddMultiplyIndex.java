package Array;

import java.util.Arrays;

public class AddMultiplyIndex {
    public static void main(String[] args) {
        int[] arr = {2, 4, 0, -1, 9, 3};
        int[] finalOutput = change(arr);
        System.out.println(Arrays.toString(finalOutput));
    }
    public static int[] change(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(i % 2 == 0){
                arr[i] = arr[i] + 10;
            }
            else{
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }
}
