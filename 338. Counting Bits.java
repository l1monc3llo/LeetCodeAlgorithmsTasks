package com.gmx;

import java.util.*;


class Solution {
    public int[] countBits(int n) {
        int[] answer = new int[n + 1];
        for (int i = 0; i <= n; ++i){
            answer[i] = answer[i>>1] + (i&1);
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println(Arrays.toString(solution.countBits(scanner.nextInt())));
        }
    }
}
