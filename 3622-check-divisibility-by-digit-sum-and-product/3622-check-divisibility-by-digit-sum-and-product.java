class Solution {
    public boolean checkDivisibility(int n) {
        int t=n;
        int sum=0;
        int p=1;
        while(t>0){
            int d=t%10;
            sum+=d;
            p*=d;
            t/=10;
        }
        int di=sum+p;
        return (n%di==0);
    }
}