class Solution {
    public Node cloneGraph(Node node) {
        if(node == null)return null;
        Map<Node,Node> mp = new HashMap<>();
        mp.put(node,new Node(node.val));
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while(q.size() > 0){
            Node original = q.poll();
            Node clone = mp.get(original);
            for(Node neighbours : original.neighbors){
                if(!mp.containsKey(neighbours)){
                    q.add(neighbours);
                    mp.put(neighbours , new Node(neighbours.val));
                }
            clone.neighbors.add(mp.get(neighbours));
            }
        }
        return mp.get(node);
    }
}
