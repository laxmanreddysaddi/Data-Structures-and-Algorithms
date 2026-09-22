class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        st.push(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(!st.isEmpty() && st.peek()==s.charAt(i)){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        String r="";
        while(!st.isEmpty()){
            r+=st.pop();
        }
        return r;
    }
}