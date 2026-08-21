class Solution {
    public boolean canPartition(int[] nums) {
       int sum=0;
       for(int i:nums){
        sum+=i;
       }
       if(sum%2!=0) return false;
       int t=sum/2;
       int n=nums.length;
       int dp[][]=new int[n+1][t+1];
       for(int i=0;i<=n;i++){
         dp[i][0]=1;
       }

       for(int i=1;i<=n;i++){
        for(int j=1;j<=t;j++){
            int in=0,ex=0;
            ex=dp[i-1][j];
           if(nums[i-1]<=j){
            in=dp[i-1][j-nums[i-1]];
           }
           dp[i][j]=in+ex;

        }
       }
       
        return dp[n][t]!=0;
    }
}