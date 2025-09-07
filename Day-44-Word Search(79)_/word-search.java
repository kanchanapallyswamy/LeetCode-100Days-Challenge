class Solution {
    public boolean exist(char[][] board, String word) {
        int r = board.length , c = board[0].length;
        boolean visited[][]= new boolean[r][c];
        for(int i = 0 ; i  < r; i++){
            for(int j = 0 ; j   < c ; j++){
                if(!visited[i][j] && board[i][j] == word.charAt(0)){
                    boolean res = dfs(visited,i,j,word,0,r,c,board);
                    if(res)return true;
                }
            }
        }
        return false;
    }
    int di[] = {-1,0,1,0};
    int dj[] = {0,1,0,-1};
    boolean dfs(boolean visited[][] , int i,int j,String word,int idx,int r,int c,char board[][]){
        if(idx == word.length() )return true;
        if(i<0 || j<0 || i>=r ||j>=c || visited[i][j] || word.charAt(idx)!=board[i][j])
            return false;
        visited[i][j] = true;
        for(int k = 0 ; k < 4; k++){
            int ni = i+di[k] , nj = j + dj[k];
            boolean res = dfs(visited,ni,nj,word,idx+1,r,c,board);
            if(res)return true;
        }
        visited[i][j]=false;
        return false;
    }
}
