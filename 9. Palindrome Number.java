package com.gmx;


import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        int originalNumb = x;
        int newNumb = 0;
        while (x > 0){
            newNumb = newNumb * 10 + x % 10;
            x /= 10;
        }
        return originalNumb == newNumb;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int x = scanner.nextInt();
            if (solution.isPalindrome(x)){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }
        }
    }
}
