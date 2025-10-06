class Solution {
    int di[]={0,0,1,-1};
    int dj[]={1,-1,0,0};
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);
        boolean visited[][] = new boolean[n][n];
        pq.add(new int[]{grid[0][0],0,0});
        visited[0][0] = true;
        int max = grid[0][0];
        while(pq.size() > 0){
            int rem[] = pq.remove();
            int t = rem[0] , i = rem[1] , j = rem[2];
            max = Math.max(max,grid[i][j]);
            if(i == n - 1 && j == n - 1)return max;
            for(int k = 0; k < 4; k++){
                int ni = di[k] + i , nj = dj[k] + j;
                if(ni >= 0 && nj >= 0 && ni < n && nj < n && !visited[ni][nj]){
                    pq.add(new int[]{grid[ni][nj],ni,nj});
                    visited[ni][nj] = true;
                }
            }
        }
        return max;
    }
}
