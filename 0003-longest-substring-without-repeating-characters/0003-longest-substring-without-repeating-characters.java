class Solution {
    public int lengthOfLongestSubstring(String s) {
        int mx=0;
        int l=0;
        Set<Character> st=new HashSet<>();
            for(int i=0;i<s.length();i++){
                while(st.contains(s.charAt(i))){
                    st.remove(s.charAt(l));
                    l++;
                }
                st.add(s.charAt(i));
                mx=Math.max(mx,st.size());
            }
            return mx;
    }
}