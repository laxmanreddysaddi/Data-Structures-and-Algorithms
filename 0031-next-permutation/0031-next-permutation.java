class Solution {
    public void nextPermutation(int[] nums) {
        int id=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                id=i;
                break;
            }
        }
        if(id==-1){
            int l=0;
            int r=n-1;
            while(l<r){
                int t=nums[l];
                nums[l]=nums[r];
                nums[r]=t;
                l++;
                r--;
            }
            return;
        }
        for(int i=n-1;i>id;i--){
           if(nums[i]>nums[id]){
            int t=nums[i];
            nums[i]=nums[id];
            nums[id]=t;
            break;
           }
        }
       int l=id+1;int r=n-1;
       while(l<r){
        int t=nums[l];
        nums[l]=nums[r];
        nums[r]=t;
        l++;
        r--;
       }
       
     for(int i=0;i<n;i++){
        System.out.print(nums[i]+" ");
     }
    }
}