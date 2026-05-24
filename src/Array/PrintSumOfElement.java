package Array;

import java.util.Scanner;

public class PrintSumOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.print("Enter array element: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int number : arr){
            sum += number;
        }
        System.out.println(sum);
    }
}