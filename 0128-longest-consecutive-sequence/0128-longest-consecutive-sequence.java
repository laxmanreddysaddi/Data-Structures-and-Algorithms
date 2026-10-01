class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){
            s.add(nums[i]);
        }
        int l=0;
        for(int i:s){
            if(s.contains(i-1)){
                continue;
            }
            int c=1;
            int nx=i+1;
            while(s.contains(nx)){
                c++;
                nx++;
            }
            l=Math.max(l,c);
        }
        return l;
    }
}