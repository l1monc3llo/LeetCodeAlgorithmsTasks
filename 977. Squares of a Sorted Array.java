class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; --i){
            if (nums[l] * nums[l] < nums[r] * nums[r]){
                ans[i] = nums[r] * nums[r];
                --r;
            }
            else{
                ans[i] = nums[l] * nums[l];
                ++l;
            }
        }
        return ans;
    }
}
