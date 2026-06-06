package Array;

import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(30);
        nums.add(20);
        nums.add(10);
        nums.add(5);
        nums.add(9);
        System.out.println(nums); // [30, 20, 10, 5, 9]

        nums.remove(4);
        nums.remove(Integer.valueOf(5)); // jab index pta na ho
        System.out.println(nums);  //[30, 20, 10]

        nums.add(1, 40);
        System.out.println(nums);  //[30, 40, 20, 10]

        nums.set(1, 20);
        System.out.println(nums);  //[30, 20, 20, 10]

        System.out.println(nums.contains(20)); // true
        System.out.println(nums.isEmpty()); // false
    }
}
