package Array;

import java.util.Arrays;

public class Segregate0and1 {
    public static void main(String[] args) {
//        int[] arr = {1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1};
        int[] arr = {0, 0, 0, 1, 0};
        // using count
        int zero = 0;
        int one = 0;
        for(int ele : arr){
            if(ele == 0){
                zero++;
            }else one++;
        }
        for(int i=0; i<zero; i++){
            arr[i] = 0;
        }
        for(int i=zero; i<arr.length; i++){
            arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));

        // using to pointer
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            if(arr[start] == 0){
                start++;
            }
            else if(arr[end] == 1){
                end--;
            }
            else{
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
