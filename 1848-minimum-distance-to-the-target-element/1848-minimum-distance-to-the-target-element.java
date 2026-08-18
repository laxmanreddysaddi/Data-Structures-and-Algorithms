class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int d=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
               d=Math.min(d,Math.abs(i-start));
            }
        }
        return d;
    }
}