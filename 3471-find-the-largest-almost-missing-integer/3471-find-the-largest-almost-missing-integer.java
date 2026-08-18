class Solution {
    public int largestInteger(int[] nums, int k) {
           int max=-1;
           int f[]=new int[51];
        for(int i=0;i<nums.length;i++){
            f[nums[i]]++;
        }
       if(k==nums.length){
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        }else if(k==1){
        for(int num:nums){
            if(f[num]==1){
               max= Math.max(max,num);
            }
        }
        }else{
            if(f[nums[0]]==1){
        max=Math.max(nums[0],max);
              }
              if(f[nums[nums.length-1]]==1){
                max=Math.max(max,nums[nums.length-1]);
              }
        }    
       return max;
    }
}