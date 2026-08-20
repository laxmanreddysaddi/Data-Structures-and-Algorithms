class Solution {
    public boolean divideArray(int[] nums) {
        int f[]=new int[1001];
        for(int i=0;i<nums.length;i++){
            f[nums[i]]++;

        }
        boolean fa=true;
        for(int i=0;i<f.length;i++){
            if(f[i]%2!=0){
                fa=false;
                break;
            }
        }
        return fa;
    }
}