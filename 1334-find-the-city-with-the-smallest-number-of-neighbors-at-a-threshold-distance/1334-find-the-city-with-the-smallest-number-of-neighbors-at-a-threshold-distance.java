class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int d[][]=new int[n][n];
       int inf=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                d[i][j]=inf;
                }
            }
        }
        for(int e[]:edges){
            int u=e[0],v=e[1],w=e[2];
            d[u][v]=d[v][u]=w;
        }
        for(int m=0;m<n;m++){
            for(int s=0;s<n;s++){
                for(int e=0;e<n;e++){
                    if(d[s][m]==inf || d[m][e]==inf)
                           continue;
                    d[s][e]=Math.min(d[s][e],d[s][m]+d[m][e]);
                }
            }
        }
        int mn=inf,mnidx=-1;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(d[i][j]<=distanceThreshold){
                    c++;
                }
            }
            if(c<=mn){
                mn=c;
                mnidx=i;
            }
        }
        return mnidx;
    }
}