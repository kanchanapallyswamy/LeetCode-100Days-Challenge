class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int r = grid.length , c = grid[0].length , k = 0;
        int mod = 12345;
        int a[] = new int[r*c];
        for(var i : grid)
            for(var j : i)
                a[k++] = j%mod;
        int p[] = new int[r*c];
        p[0] = a[0]%mod ;
        int n = a.length;
        for(int i = 1 ; i < n; i++){
            p[i] = (a[i] * p[i-1])%mod;
        }
        int s[] = new int[r*c];
         s[n-1] = a[n-1]%mod;
        for(int i = n - 2 ; i >= 0 ; i--){
            s[i] = (a[i]*s[i+1])%mod;
        }
        int res[] = new int[r*c];
        res[0] =s[1]%mod;
        res[n-1] = p[n-2]%mod;
        for(int i = 1;i < n - 1 ; i++){
            res[i] = (int)(((long)p[i-1] * s[i+1])%mod);
        }
        System.out.println(Arrays.toString(a)+" -> "+Arrays.toString(p)+" -> "+ Arrays.toString(s)+" -> "+Arrays.toString(res));
        k = 0;
        int ans[][] = new int[r][c];
        for(int i = 0 ; i < r ;i++)
            for(int j = 0 ;j < c ;j++)
                ans[i][j] = res[k++];
        
        return ans;
    }
}
