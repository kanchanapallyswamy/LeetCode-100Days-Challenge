class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> outer=new ArrayList<>();
        List<Integer> inner=new ArrayList<>();
        if(root==null)return outer;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int c=0;
        while(!q.isEmpty()){
            TreeNode k=q.remove();
            if(k!=null){
                inner.add(k.val);
                if(k.left!=null)q.add(k.left);
                if(k.right!=null)q.add(k.right);
            }
            else{
                if((c&1)==0){
                    outer.add(inner);
                }
                else{
                    Collections.reverse(inner);
                    outer.add(inner);
                }
                inner=new ArrayList<>();
                if(q.isEmpty())break;
                q.add(null);
            c++;
            }
            
        }
        return outer;
        
    }
}
