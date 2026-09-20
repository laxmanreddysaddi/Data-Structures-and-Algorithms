class Solution {
    public int reverseDegree(String s) {
        int f[]=new int[26];
        int n=26;
        for(int i=0;i<26;i++){
            f[i]=n;
            n-=1;
        }
        int ans=0;
        for(int i=0;i<s.length();i++){
            int p=1;
            p=(i+1)*f[s.charAt(i)-'a'];
            ans+=p;
        }
       return ans;
    }
}