package Array;

import java.util.ArrayList;

public class Merge2SortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 5, 6, 9};
        int[] arr2 = {1, 3, 4, 5, 7, 8};
        int i = 0;
        int j = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                result.add(arr1[i]);
                i++;
            }
            else{
                result.add(arr2[j]);
                j++;
            }
        }
        while(i < arr1.length){
            result.add(arr1[i]);
            i++;
        }
        while (j < arr2.length){
            result.add(arr2[j]);
            j++;
        }
        System.out.println(result);
    }
}
