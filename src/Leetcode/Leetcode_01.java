package Leetcode;

import java.util.HashMap;

public class Leetcode_01 {
    public static void main(String[] args) {
        // input nums = [2,7,11,15] , target = 9 => output [0,1]
        // input nums = [3,2,4] , target = 6 => output [1,2]
        // input nums = [3,3] , target = 6 => outpur [0,1]

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = twoSum(nums, target);
        System.out.println(ans[0] + " " + ans[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }
}