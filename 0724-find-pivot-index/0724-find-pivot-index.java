class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int pr[]=new int[n];
        int su[]=new int[n];
        pr[0]=0;
        su[n-1]=0;
        for(int i=1;i<n;i++){
            pr[i]=pr[i-1]+nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            su[i]=su[i+1]+nums[i+1];
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            if(pr[i]==su[i]){
                ans=i;
                break;
            }
        }
        return ans;
    }
}