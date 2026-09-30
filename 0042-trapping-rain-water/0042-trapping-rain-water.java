class Solution {
    public int trap(int[] height) {
        int lm=0,rm=0,t=0;
        int n=height.length;
        int l=0,r=n-1;
        while(l<r){
            if(height[l]<=height[r]){
                if(lm>height[l]){
                    t+=lm-height[l];
                }else{
                    lm=height[l];
                }
                l+=1;
            }else{
                if(rm>height[r]){
                    t+=rm-height[r];
                }else{
                    rm=height[r];
                }
                r--;
            }
        }
        return t;
    }
}