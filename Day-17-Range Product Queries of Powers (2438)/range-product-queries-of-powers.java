class Solution {
    public int[] productQueries(int n, int[][] q) {
        int MOD = 1000000007;
        String s = Integer.toBinaryString(n);
        int ans[] = new int[s.length()];
        int p = 0;
        List<Integer> ls = new ArrayList<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1')
                ls.add((int) Math.pow(2, p));
            p++;
        }
        Collections.sort(ls);
        List<Integer> lst = new ArrayList<>();
        for (var i : q) {
            int l = i[0], r = i[1];
            long p1 = 1;
            for (int j = l; j <= r; j++) {
                p1 = (p1 * ls.get(j)) % MOD;
            }
            lst.add((int) p1);
        }
        int res[] = new int[lst.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = lst.get(i);
        }
        return res;
    }
}
