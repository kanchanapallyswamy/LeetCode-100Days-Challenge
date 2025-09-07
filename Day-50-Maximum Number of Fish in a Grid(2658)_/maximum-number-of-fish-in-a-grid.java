class Solution {
    public int findMaxFish(int[][] grid) {
        int max=0;
        int r=grid.length,c=grid[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]>0){
                  int  ans=find(grid,r,c,i,j);
                    max=Math.max(max,ans);
                }
            }
        }
        return max;
    }
    int di[]={-1,0,1,0};
    int dj[]={0,1,0,-1};
    int find(int a[][],int r,int c,int i,int j){
         if (!isValid(r, c, i, j) || a[i][j] == 0) return 0;
        int cnt=a[i][j];
        a[i][j]=0; 
        for(int k=0;k<4;k++){
            int nni=i+di[k],nnj=j+dj[k];
                cnt+=find(a,r,c,nni,nnj);
        }
        return cnt;
    }
    boolean isValid(int r,int c,int i,int j){
        return (i>=0 && j>=0 && i<r && j<c);
    }
}
