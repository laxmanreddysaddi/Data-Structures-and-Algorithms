class Solution {
    public int strStr(String haystack, String needle) {
        int s=0;
        int n= haystack.length();
        int m= needle.length();
        if(m>n){
            return -1;
        }
        while(s<=n-m){
            int i=s; int j=0;
            while(j<=m){
                 if(j==m){  
                    return s;
                }
                if(haystack.charAt(i)==needle.charAt(j)){
                    i++;
                    j++;
                }else{
                    s++;
                    break;
                }
            }
        }
        return -1;
    }
}