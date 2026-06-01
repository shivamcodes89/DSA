package Array;

public class MinInArray {
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 10, 6, 3, 7, 8, 4};
        int min = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
