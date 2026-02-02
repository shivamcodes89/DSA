package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 12, 13, 14, 19, 22, 25, 29};
        int key = 19;
        System.out.println(largestNum(arr, key));
    }
    public static int largestNum(int[] arr, int key){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == key) return mid;
            else if (arr[mid] < key) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
