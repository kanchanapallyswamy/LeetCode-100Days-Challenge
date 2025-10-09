class Solution {
    public List<Boolean> checkIfPrerequisite(int n, int[][] pre, int[][] qu) {
        Map < Integer, List < Integer >> mp = new HashMap < > ();
        int in[] = new int[n+1];
        boolean visit[] = new boolean[n+1];
        Map<Integer,Map<Integer,Boolean>> mp1 = new HashMap<>();
        for(int i = 0; i < n; i++)
            mp1.put(i,new HashMap<>());
        for (int i = 0; i < n; i++) {
            mp.put(i, new ArrayList <> ());
        }
        for (int i = 0; i < pre.length; i++) {
            int u = pre[i][0], v = pre[i][1];
            mp.get(u).add(v);
            in[v]++;

        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < n ; i++){
            if(in[i] == 0 )
                q.add(i);
        }
        while (q.size() > 0) {
            int u = q.remove();
            for (var v: mp.get(u)) {
                mp1.get(v).put(u,true);
                mp1.get(v).putAll(mp1.get(u));
                in[v]--;
                if (in[v] == 0) {
                    q.add(v);
                }
            }
        }
        List<Boolean> res = new ArrayList<>();
        for(var i : qu){
            int u = i[0] , v = i[1];
           res.add(mp1.get(v).containsKey(u));
        }
        return res;
    }
}
