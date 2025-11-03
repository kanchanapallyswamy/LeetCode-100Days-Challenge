class Solution {
    public int findCircleNum(int[][] edges) {
        int v = edges.length;
        Map<Integer, Set<Integer>> mp = new HashMap<>();
        for (int i = 1; i <= v; i++)
            mp.put(i, new HashSet<>());
        for (var i = 1; i <= edges.length; i++) {
            for (int j = 1; j <= edges.length; j++) {
                int u = edges[i - 1][j - 1];
                if (u == 1 && i != j) {
                    mp.get(i).add(j);
                    mp.get(j).add(i);
                }
            }
        }
        int cnt = 0;
        boolean visited[] = new boolean[v + 1];
        for (int i = 1; i <= v; i++) {
            if (!visited[i]) {
                cnt++;
                bfs(mp, i, visited);
            }
        }
        return cnt;
    }

    static void bfs(Map<Integer, Set<Integer>> mp, int src, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited[src] = true;
        while (q.size() > 0) {
            int r = q.remove();
            for (var p : mp.get(r)) {
                if (!visited[p]) {
                    q.add(p);
                    visited[p] = true;
                }
            }
        }

    }
}
