package Array;

public class LargestNumber {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {67, 23, 59, 78, 100, 32, 89, 91};
//        int MaxNumber = arr[0];
//        for(int i=1; i< arr.length; i++){
//            if(arr[i] > MaxNumber){
//                MaxNumber = arr[i];
//            }
//        }
//        System.out.println(MaxNumber);

        System.out.println("largest value is: " + getLargest(arr));

    }
}
