package Array;

import java.util.Scanner;
import java.util.Arrays;
public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter target: ");
        int target = sc.nextInt();
        System.out.println("enter length: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("enter element: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
//        // travel every index
//        for(int i=0; i<arr.length; i++){
//            if(target == arr[i]){
//                System.out.println(i);
//            }
//        }

        // binary search
        Arrays.sort(arr);
        System.out.println("After sorting array will be changed into ascending order 😊");
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        System.out.println("target is not found in arr!");
    }
}
