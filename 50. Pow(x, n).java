package com.gmx;

import java.util.Scanner;


class Solution {
    public double myPow(double x, int n){
        if (n == Integer.MIN_VALUE) {
            x = 1 / x;
            return x * myPow(x, Integer.MAX_VALUE);
        }
        if (n == 0) return 1.0;
        if (n == 1) return x;
        if (n < 0){
            x = 1 / x;
            n = -n;
        }
        if (n % 2 == 0) {
            double half = myPow(x, n / 2);
            return half * half;
        }
        return x * myPow(x, n - 1);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        while (true){
            double x = scanner.nextDouble();
            int n = scanner.nextInt();
            System.out.println(solution.myPow(x, n));
        }
    }
}
