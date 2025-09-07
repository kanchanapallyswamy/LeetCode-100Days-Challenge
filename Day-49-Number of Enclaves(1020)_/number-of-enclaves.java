class Solution {
     int di[] = {-1,0,1,0};
     int dj[] = {0,1,0,-1};
    public int numEnclaves(int[][] board) {
        int r = board.length , c = board[0].length;
        boolean visited[][] = new boolean[r][c];
        for(int  i = 0  ; i  <r ;i++){
            for(int j = 0 ;  j < c; j++){
                if(i==0 || j ==0 || i== r-1 || j== c-1){
                    if(board[i][j] ==1){
                        dfs(board,i,j,r,c,visited);
                    }
                }
            }
        }
        int cnt = 0;
        for(int i = 0 ;  i < r; i++){
            for(int j = 0; j <c; j++){
                if(board[i][j] ==1)cnt++;
            }
        }
        return cnt;
    }
     void dfs(int board[][] , int i,int j,int r ,int c,boolean visited[][]){
        visited[i][j]=true;
        board[i][j]=0;
         for(int k = 0  ; k < 4; k++){
                int ni = di[k]+i , nj = dj[k]+j;
                if(ni>=0 && ni<r && nj>=0 && nj<c && !visited[ni][nj] && board[ni][nj]==1){
                   dfs(board,ni,nj,r,c,visited);
                }
    }
    }
}
