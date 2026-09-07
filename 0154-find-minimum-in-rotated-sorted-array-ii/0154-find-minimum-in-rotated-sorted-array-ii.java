class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int min = nums[0];
        
        while (i <= j) {
            int m = (i + j) / 2;
            min = Math.min(min, nums[m]);
            if (nums[m] < nums[j]) {
                j = m - 1;
            } else if (nums[m] > nums[j]) {
                i = m + 1;
            } else {
                j--;
            }
        }
        return min;
    }
}
