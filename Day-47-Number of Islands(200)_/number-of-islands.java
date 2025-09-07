class Solution {
    int di[]={-1,0,1,0};
    int dj[]={0,1,0,-1};
    public int numIslands(char[][] a) {
      int r=a.length,c=a[0].length; 
      int cnt=0;
      boolean visited[][] = new boolean[r][c];
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(a[i][j]=='1' && !visited[i][j]){
                cnt++;
                bfs(a,r,c,i,j,visited);
            }
        }
      } 

      return cnt;
    }
    void bfs(char a[][],int r,int c,int i,int j,boolean visited[][]){
        if(i>=r || j>=c || i<0 || j<0 || visited[i][j] || a[i][j]=='0')return ;
        visited[i][j]=true;
        for(int k=0;k<4;k++){
            bfs(a,r,c,i+di[k],j+dj[k],visited);
        }


    }
}
