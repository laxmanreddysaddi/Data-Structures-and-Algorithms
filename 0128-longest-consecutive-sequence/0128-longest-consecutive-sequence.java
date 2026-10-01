class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int lo=0;
        int c=0;
        int ls=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1==ls){
                c+=1;
                ls=nums[i];
            }else if(nums[i]!=ls){
                c=1;
                ls=nums[i];
            }
            lo=Math.max(c,lo);
        }
        return lo;
    }
}