class Solution {
    public boolean isBipartite(int[][] edges) {
        int V = edges.length;
        boolean visited[] = new boolean[V];
        int color[] = new int[V];
        Arrays.fill(color, -1);
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for (int i = 0; i < V; i++)
            mp.put(i, new ArrayList<>());
        for (var i = 0; i < edges.length; i++) 
            for (var j : edges[i]) 
                mp.get(i).add(j);
        for (int i = 0; i < V; i++) 
            if (!visited[i]) 
                if (!coloring(mp, visited, i, color))
                    return false;
        return true;
    }

    boolean coloring(Map<Integer, List<Integer>> mp, boolean[] visited, int src, int color[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visited[src] = true;
        color[src] = 0;
        int c = 0;
        while (q.size() > 0) {
            int k = q.remove();
            for (var v : mp.get(k)) {
                if (!visited[v]) {
                    q.add(v);
                    visited[v] = true;
                    color[v] = (color[k] == 1) ? 0 : 1;
                } else if (color[k] == color[v])
                    return false;

            }
        }

        return true;
    }
}
