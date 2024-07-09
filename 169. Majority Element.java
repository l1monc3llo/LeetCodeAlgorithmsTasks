package com.gmx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; ++i){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2){
                return entry.getKey();
            }
        }
        return -1;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        while (true){
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; ++i){
                int m = scanner.nextInt();
                nums[i] = m;
            }
            System.out.println(solution.majorityElement(nums));
        }
    }
}
