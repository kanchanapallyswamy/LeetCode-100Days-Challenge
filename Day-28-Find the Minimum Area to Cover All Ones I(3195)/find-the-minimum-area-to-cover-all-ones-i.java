class Solution {
    public int minimumArea(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        int minrow = r, mincol = c;
        int maxrow = 0, maxcol = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1) {
                    minrow = Math.min(minrow, i);
                    maxrow = Math.max(maxrow, i);
                    mincol = Math.min(mincol, j);
                    maxcol = Math.max(maxcol, j);
                }
            }
        }
        return (maxrow - minrow + 1) * (maxcol - mincol + 1);
    }
}
