class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        int l=1;
        while(l<n){
            if(n%l==0){
            String sb=s.substring(0,l);
            boolean m=true;
            for(int i=0;i<n;i++){
                if(s.charAt(i)!=sb.charAt(i%l)){
                    m=false;
                    break;
                }
            }
            if(m) return true;
            }
            l++;
        }
        return false;
    }
}