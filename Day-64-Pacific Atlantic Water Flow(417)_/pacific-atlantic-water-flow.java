class Solution {
    int di[]={-1,0,1,0};
    int dj[]={0,1,0,-1};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> outer = new ArrayList<>();
        int r = heights.length , c = heights[0].length; 
        boolean atlantic[][] = new boolean[r][c];
        boolean pacific[][] = new boolean[r][c];

        for (int i = 0; i < r; i++) bfs(i, 0, r , c , pacific , heights);
        for (int j = 0; j < c; j++) bfs(0, j , r , c , pacific, heights);
        
        for (int i = 0; i < r; i++) bfs(i, c - 1 , r , c , atlantic , heights);
        for (int j = 0; j < c; j++) bfs(r - 1, j , r , c , atlantic , heights);

         for(int i = 0; i < r ; i++)
            for(int j = 0 ; j < c ; j++)
                if(pacific[i][j] && atlantic[i][j])
                    outer.add(Arrays.asList(i,j));

        return outer;
    }
    void bfs(int si,int sj,int r,int c,boolean visited[][] , int [][]m){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{si,sj});
        visited[si][sj] = true;
        while(q.size() > 0){
            int n = q.size();
            while(q.size() > 0){
                int rem[] = q.remove();
                int i = rem[0] , j = rem[1];
                for(int k = 0; k < 4; k++){
                    int ni = i + di[k] , nj = j + dj[k];
                    if(ni >= 0 && nj >= 0 && ni < r && nj < c && m[i][j] <= m[ni][nj] && !visited[ni][nj]){
                        q.add(new int[]{ni,nj});
                        visited[ni][nj] = true;
                    }
                }
            }

        }

    }
}
