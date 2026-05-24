package Array;

import java.util.Scanner;

public class ProductAndMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.print("Enter array elemnt: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // maximum element method
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);

        // product of each element
        int product = 1;
        for(int i=0; i<arr.length; i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}
