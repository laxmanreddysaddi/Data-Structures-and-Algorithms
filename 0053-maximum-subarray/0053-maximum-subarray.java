class Solution {
    public int maxSubArray(int[] nums) {
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            c+=num;
            if(c>max){
                max=c;
            }
            if(c<0){
                c=0;
            }
        }
        return max;
    }
}