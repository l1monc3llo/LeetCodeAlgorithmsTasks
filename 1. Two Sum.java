package com.gmx;


import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; ++i){
            if (numMap.containsKey(target - nums[i])){
                return new int[]{numMap.get(target - nums[i]), i};
            }
            numMap.put(nums[i], i);
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            int target = scanner.nextInt();
            int[] result = solution.twoSum(nums, target);
            System.out.println(result[0] + " " + result[1]);
        }
    }
}
