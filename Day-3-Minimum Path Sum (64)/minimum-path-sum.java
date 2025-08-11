class Solution {
    int dp[][] = new int[201][201];

    public int minPathSum(int[][] grid) {
        for (var i : dp)
            Arrays.fill(i, -1);
        return helper(grid, 0, 0, grid.length, grid[0].length);
    }

    int helper(int[][] grid, int i, int j, int r, int c) {
        if (i >= r || j >= c || i < 0 || j < 0)
            return dp[i][j] = Integer.MAX_VALUE;
        if (i == r - 1 && j == c - 1)
            return dp[i][j] = grid[i][j];
        if (dp[i][j] != -1)
            return dp[i][j];
        return dp[i][j] = grid[i][j] + Math.min(helper(grid, i, j + 1, r, c),
                helper(grid, i + 1, j, r, c));
    }
}
