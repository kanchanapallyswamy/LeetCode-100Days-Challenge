class Solution {
    int di[] = {-1,0,1,0};
    int dj[] = {0,1,0,-1};
    public void solve(char[][] board) {
        int r = board.length , c = board[0].length;
        boolean visited[][] = new boolean[r][c];
        Queue<int[]> q = new LinkedList<>();
        for(int  i = 0  ; i  <r ;i++){
            for(int j = 0 ;  j < c; j++){
                if(i==0 || j ==0 || i== r-1 || j== c-1){
                    if(board[i][j] =='O'){
                        q.add(new int[]{i,j});
                        visited[i][j] = true;
                    }
                }
            }
        }
        while(q.size()>0){
            var rem = q.remove();
            int i = rem[0] ,  j =rem[1];
            for(int k = 0  ; k < 4; k++){
                int ni = di[k]+i , nj = dj[k]+j;
                if(ni>=0 && ni<r && nj>=0 && nj<c && !visited[ni][nj] && board[ni][nj]=='O'){
                    q.add(new int[]{ni,nj});
                    visited[ni][nj]=true;
                }
            }

        }
        for(int i = 0 ;  i < r; i++){
            for(int j = 0; j <c; j++){
                if(!visited[i][j]){
                    board[i][j] = 'X';
                }
                else board[i][j]='O';
            }
        }
    }
}
