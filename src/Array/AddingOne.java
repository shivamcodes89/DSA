package Array;

import java.util.Vector;

public class AddingOne {
    public static void main(String[] args) {
        int[] arr = {9, 9, 9, 9};
        System.out.println(addOne(arr));
    }


    public static Vector<Integer> addOne(int[] arr) {
        int n = arr.length;
        for(int i=n-1; i>=0; i--){
            if(arr[i] < 9){
                arr[i]++;
                return changeVector(arr);
            }else{
                arr[i] = 0;
            }
        }
        Vector<Integer> ans = new Vector<>();
        ans.add(1);
        for(int i=1; i<=n; i++){
            ans.add(0);
        }
        return ans;
    }


    public static Vector<Integer> changeVector(int[] arr){
        Vector<Integer> vec = new Vector<>();
        for(int num : arr){
            vec.add(num);
        }
        return vec;
    }
}