class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0,0));
        Map<Integer,List<int[]>> mp = new TreeMap<>();
        while(q.size()>0){
            Pair rem = q.poll();
            TreeNode node = rem.node;
            int col = rem.col;
            int row = rem.row;
            if(!mp.containsKey(col)){
                mp.put(col,new ArrayList<>());
            }
            mp.get(col).add(new int[]{node.val,row});
            if(node.right!=null)q.add(new Pair(node.right,col+1,row+1));
            if(node.left!=null) q.add(new Pair(node.left,col-1,row+1));
        }
        List<List<Integer>> outer = new ArrayList<>();
        for(var i : mp.entrySet()){
            List<int[]> inner = i.getValue();
            Collections.sort(inner , (p1,p2)->{
                if(p1[1] == p2[1]) return p1[0] - p2[0];
                return p1[1] - p2[1];
            });
            List<Integer> ans = new ArrayList<>();
            for(var u : inner)ans.add(u[0]);
            outer.add(ans);
        }
        return outer;
    }
}
class Pair{
    int col;
    int row;
    TreeNode node;
    Pair(TreeNode n,int x,int r){
        col = x;
        node = n;
        row = r;
    }
}
