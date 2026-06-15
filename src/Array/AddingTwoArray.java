package Array;

import java.util.ArrayList;

public class AddingTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {3, 6, 7, 0, 8, 2};
        int[] arr2 = {2, 4, 5, 7};
        ArrayList<Integer> result = new ArrayList<>();
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        while(i >= 0 || j >= 0 || carry > 0){
            int sum = carry;
            if(i >= 0){
                sum =+ sum + arr1[i];
                i--;
            }
            if(j >= 0){
                sum =+ sum + arr2[j];
                j--;
            }
            result.add((sum)%10);
            carry = sum/10;
        }
        System.out.println(result.reversed());
    }
}
