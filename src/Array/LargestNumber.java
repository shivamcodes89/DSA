package Array;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 3, 0, 10, 9};
        System.out.println("largest value is: " + largestNumber(arr));
    }

    public static int largestNumber(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
}
