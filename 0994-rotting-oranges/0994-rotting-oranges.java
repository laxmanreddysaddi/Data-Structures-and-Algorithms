class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int f=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j]==1){
                    f++;
                }
            }
        }
        if(f==0) return 0;
        int ans=-1;
        int di[][]={{0,-1},{1,0},{0,1},{-1,0}};
        while(!q.isEmpty() ){
            int s=q.size();
            for(int i=0;i<s;i++){
                int c[]=q.remove();
            for(int d[]:di){
                int dx=c[0]+d[0],dy=c[1]+d[1];
                if(dx>=0 && dx<grid.length && dy>=0 && dy<grid[0].length && grid[dx][dy]==1){
                    grid[dx][dy]=2;
                    q.add(new int[]{dx,dy});
                    f--;
                }
            }
            }
            ans++;
        }
        return f==0?ans:-1;
    }
}