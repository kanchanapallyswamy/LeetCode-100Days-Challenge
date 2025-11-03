class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        Map<Integer, List<Integer>> mp = new HashMap<>();
        int n = graph.length;
        int indegree[] = new int[n];
        for (int i = 0; i < n; i++)
            mp.put(i, new ArrayList<>());
        for (var i = 0; i < n; i++) {
            for (var j : graph[i]) {
                mp.get(j).add(i);
                indegree[i]++;
            }
        }
        List<Integer> l = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for (var i = 0; i < n; i++) {
            if (indegree[i] == 0)
                q.add(i);
        }
        while (q.size() > 0) {
            int k = q.peek();
            l.add(q.remove());
            for (var i : mp.get(k)) {
                indegree[i]--;
                if (indegree[i] == 0) {
                    q.add(i);
                }

            }
        }
        Collections.sort(l);
        return l;
    }

}
