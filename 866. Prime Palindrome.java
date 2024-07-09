package com.gmx;

import java.util.Scanner;

import static java.lang.Math.sqrt;


class Solution {
    public boolean isPrime(int n){
        if (n <= 1) return false;
        for (int i = 2; i <= sqrt(n); ++i){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    public long createPalindrome (int n){
        long newNumb = n;
        while ((n/=10) > 0){
            newNumb = newNumb * 10 + n % 10;
        }
        return newNumb;
    }

    public int primePalindrome(int n) {
        if (n >= 8 && n <= 11){
            return 11;
        }
        for (int i = 2; i >= 0; ++i){
            int potentialAns = (int)createPalindrome(i);
            if (potentialAns >= n && isPrime(potentialAns)){
                return potentialAns;
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
            int result = solution.primePalindrome(n);
            System.out.println(result);
        }
    }
}
