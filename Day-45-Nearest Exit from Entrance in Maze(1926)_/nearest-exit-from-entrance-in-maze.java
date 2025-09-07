class Solution {
     int di[] = {-1,0,1,0};
    int dj[] = {0,1,0,-1};
    public int nearestExit(char[][] maze, int[] entrance) {
      int steps = -1;
      int r = maze.length , c = maze[0].length;
      int si = entrance[0] , sj = entrance[1] ;
      boolean visited[][] = new boolean[r][c];
      Queue<int[]> q = new LinkedList<>();
      visited[si][sj] = true;
      q.add(new int[]{si,sj});
      while(q.size() >0){
        int n = q.size();
        steps++;
        while(n-->0){
        int rem[] = q.remove();
        int ri = rem[0] , rj = rem[1];
        if((ri== 0 || ri == r-1 || rj ==0 || rj == c-1) && !(ri == si && rj == sj))return steps;
        for(int k=0;k<4;k++){
            int ni = ri+di[k] , nj = rj+dj[k];
            if(ni>=0 && nj>=0 && ni<r && nj<c && !visited[ni][nj]&& maze[ni][nj] != '+'){
                q.add(new int[]{ni,nj});
                visited[ni][nj]=true;
            }
        }
      }  
      }
      return -1;
    }
}
