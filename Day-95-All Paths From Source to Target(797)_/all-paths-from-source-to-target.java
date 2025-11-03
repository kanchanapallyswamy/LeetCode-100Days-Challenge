class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        inner.add(0);
        dfs(graph, 0, inner, outer);
        return outer;
    }

    void dfs(int[][] graph, int node, List<Integer> inner, List<List<Integer>> outer) {
        if (node == graph.length - 1) {
            outer.add(new ArrayList<>(inner));
            return;
        }
        for (var i : graph[node]) {
            inner.add(i);
            dfs(graph, i, inner, outer);
            inner.remove(inner.size() - 1);
        }
    }
}
