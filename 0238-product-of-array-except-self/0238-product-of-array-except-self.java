class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pr[]=new int[n];
        pr[0]=1;
        int suf[]=new int[n];
        suf[n-1]=1;
        for(int i=1;i<n;i++){
           pr[i]=pr[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suf[i]=suf[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
           nums[i]=pr[i]*suf[i];
        }
        return nums;
    
    }
}