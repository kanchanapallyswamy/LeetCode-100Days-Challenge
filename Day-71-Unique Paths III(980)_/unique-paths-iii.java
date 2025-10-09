class Solution {
    int[] di = {-1, 0, 1, 0};
    int[] dj = {0, 1, 0, -1};
    public int uniquePathsIII(int[][] grid) {
        int r = grid.length , c = grid[0].length;
        for(int i = 0 ; i < r; i++){
            for(int j = 0; j < c; j++){
                if(grid[i][j] == 1){
                    return solve(grid,i,j,r,c);
                }
            }
        }
        return -1;
    }
    int solve(int a[][],int i,int j,int r,int c){
        if(a[i][j] == 2){
            if(allAreVisited(a,r,c))
                return 1;
            else 
                return 0;
        }
        int temp = a[i][j];
        a[i][j] = -99;
        int total = 0;
        for (int d = 0; d < 4; d++) {
            int ni = i + di[d];
            int nj = j + dj[d];
            if(ni >= 0 && nj >=0 && ni < r && nj < c && a[ni][nj] != -1 && a[ni][nj] != -99)
                total += solve(a, ni, nj, r, c);
        }
        a[i][j] =temp;
        return total ;
    }
    boolean allAreVisited(int a[][],int r,int c){
        for(int i = 0 ; i  < r;i++)
            for(int j = 0 ; j  < c ; j++)
                if(a[i][j] == 0)
                    return false;
        return true;
    }
}
