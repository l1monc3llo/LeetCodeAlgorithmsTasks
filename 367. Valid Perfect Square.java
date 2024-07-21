class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1 ) return true;
        int l = 1, r = num/2;
        while (l<=r){
            int mid = l+(r-l)/2; // to prevent overflow when calculating the midpoint
            long sq = (long) mid*mid;
            if (sq == num) return true;
            if (sq < num) l = mid+1;
            else r = mid-1;
        }
        return false;
    }
}
