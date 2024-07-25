class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums);
    }
    
    private int[] mergeSort(int[] nums) {
        if (nums.length <= 1) return nums;
        int mid = nums.length / 2;
        int[] left = Arrays.copyOfRange(nums, 0, mid);
        int[] right = Arrays.copyOfRange(nums, mid, nums.length);
        mergeSort(left);
        mergeSort(right);
        return merge(nums, left, right);
    }
    
    private int[] merge(int[] nums, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }
        
        while (i < left.length) {
            nums[k++] = left[i++];
        }
        
        while (j < right.length) {
            nums[k++] = right[j++];
        }
        
        return nums;
    }
}
