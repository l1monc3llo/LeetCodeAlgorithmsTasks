class Solution {
    public int addDigits(int num) {
        while (num >= 10){
            int cur = num;
            int newNum = 0;
            while (cur > 0) {
                int d = cur%10;
                cur /= 10;
                newNum+=d;
                
            }
            num = newNum;
        }
        return num;
    }
}
