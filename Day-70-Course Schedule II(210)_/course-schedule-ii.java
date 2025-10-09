class Solution {
    public int[] findOrder(int v, int[][] edges) {
        Map<Integer,List<Integer>> mp = new HashMap<>();
        for(int i =0 ;  i<v;i++)mp.put(i,new ArrayList<>());
        int indegree[] = new int[v];
        for(var ii : edges){
            int u = ii[0] , vv = ii[1];
            mp.get(u).add(vv);
            indegree[vv]++;
        }
        ArrayList<Integer> l = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(var i=0;i<v;i++){
            if(indegree[i]==0)q.add(i);
        }
        if(q.size() == 0)return new int[0];
        while(q.size()>0){
            int k =  q.peek();
            l.add(q.remove());
            for(var i : mp.get(k)){
                indegree[i]--;
                if(indegree[i] ==0){
                    q.add(i);
                }
                
            }
        }
        if(l.size()<v)return new int[0];
        int ans[] = new int[v];
        int p = 0;
        System.out.println(l);
        for(var i =l.size()-1;i>=0;i--){
            ans[p++]=l.get(i);
        }
        return ans;
    }
}
