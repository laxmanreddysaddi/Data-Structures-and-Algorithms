class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> s=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            Set<Integer> st=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int t=-(nums[i]+nums[j]);
                if(st.contains(t)){
                    s.add(Arrays.asList(nums[i],nums[j],t));
                }else{
                    st.add(nums[j]);
                }
            }
        }
        return new ArrayList<>(s);
    }
}