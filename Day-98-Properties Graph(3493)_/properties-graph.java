class Solution {
    public int numberOfComponents(int[][] p, int k) {
        HashMap<Integer, List<Integer>> mp = new HashMap<>();
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                if (fun(p, i, j) >= k) {
                    mp.putIfAbsent(i, new ArrayList<>());
                    mp.putIfAbsent(j, new ArrayList<>());
                    mp.get(i).add(j);
                    mp.get(j).add(i);
                }
            }
        }
        dsu obj = new dsu(p.length);
        int c = p.length;
        for (var s : mp.entrySet()) {
            List<Integer> l = s.getValue();
            for (var ss : l) {
                if (obj.merge(ss, s.getKey()))
                    c--;
            }
        }

        return c;
    }

    public int fun(int[][] p, int i, int j) {
        HashSet<Integer> hs = new HashSet<>();
        boolean vis[] = new boolean[101];
        for (int k = 0; k < p[0].length; k++) {
            hs.add(p[i][k]);
            vis[p[i][k]] = true;
        }

        int c = 0;
        for (int k = 0; k < p[0].length; k++) {
            if (hs.contains(p[j][k]) && vis[p[j][k]]) {
                c++;
                vis[p[j][k]] = false;
            }
        }

        return c;
    }
}

class dsu {
    int p[], s[];
    public dsu(int n) {
        p = new int[n];
        s = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i;
            s[i] = 1;
        }
    }
    public int find(int n) {
        if (p[n] != n)
            p[n] = find(p[n]);
        return p[n];
    }
    public boolean merge(int x, int y) {
        int xx = find(x);
        int yy = find(y);
        if (xx != yy) {
            if (s[xx] > s[yy]) {
                p[yy] = p[xx];
                s[xx] += s[yy];
            } else {
                p[xx] = p[yy];
                s[yy] += s[xx];
            }
            return true;
        }
        return false;
    }

}

