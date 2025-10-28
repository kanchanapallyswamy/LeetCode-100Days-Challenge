class Solution {
    int di[] = {-1,0,1,0};
    int dj[] = {0,1,0,-1};
    public List<String> findWords(char[][] board, String[] words) {
        int r= board.length , c= board[0].length;
        Set<String> res = new HashSet<>();
        Set<String> st = new HashSet<>();
        Set<String> prefix = new HashSet<>();
        for(var i : words){
            st.add(i);
            for(int j = 1; j <= i.length(); j++)
                    prefix.add(i.substring(0,j));
        }
        boolean visited[][] = new boolean[r][c];
        for(int i = 0 ; i < r; i++)
            for(int j = 0 ; j < c; j++)
                dfs(board,i,j,r,c,"",visited,st,prefix,res);

        return new ArrayList<>(res);
                
    }
    void dfs(char [][] a,int i,int j,int r,int c,String s,boolean visited[][],Set<String> st,Set<String> prefix,Set<String> res){
            s += a[i][j];
        if(!prefix.contains(s))return ;
        if(st.contains(s)){
            res.add(s);
        }
        visited[i][j]=true;
        for(int k = 0 ; k < 4 ; k++){
            int ni  = di[k]+ i , nj = dj[k]+j;
            if(ni >= 0 && nj >= 0 && ni < r && nj < c && !visited[ni][nj])
                dfs(a,ni,nj,r,c,s,visited,st,prefix,res);
        }
        visited[i][j] = false;
    }
}
