class Solution {
    public int findMin(int[] nums) {

        if(nums.length==2){
            return Math.min(nums[0],nums[1]);
        }
        int i=0;
        int j=nums.length-1;
        int min=nums[0];
        while(i<=j){
            int m=(i+j)/2;
            if(nums[m]<min){
                min=nums[m];
            }else if(nums[m]>min){
                i=m+1;
            }else{
                j=m-1;
            }
        }
        return min;
    }
}