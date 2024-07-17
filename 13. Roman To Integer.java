package com.gmx;

import java.util.*;


class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        int result = hashMap.get(s.charAt(s.length() - 1));
        for (int i = s.length() - 2; i >= 0; --i) {
            if (hashMap.get(s.charAt(i + 1)) > hashMap.get(s.charAt(i))) {
                result -= hashMap.get(s.charAt(i));
            } else {
                result += hashMap.get(s.charAt(i));
            }
        }
        return result;
    }

}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println(solution.romanToInt(scanner.nextLine()));
        }
    }
}
