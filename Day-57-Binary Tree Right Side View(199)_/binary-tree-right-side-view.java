class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> outer=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        outer=func(root);
        for(var i:outer){
            ans.add(find(i));
        }
        return ans;
    }
     static List<List<Integer>> func(TreeNode root){
        List<List<Integer>> outer=new ArrayList<>();
        if(root==null)return outer;
        List<Integer> inner=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode k=q.remove();
            if(k!=null){
                inner.add(k.val);
                if(k.left!=null)q.add(k.left);
                if(k.right!=null)q.add(k.right);
            }
            else{
                outer.add(inner);
                inner=new ArrayList<>();
                if(q.isEmpty())break;
                q.add(null);
            }
        }
        return outer;
    }
    static int find(List<Integer> a){
        Collections.reverse(a);
        return a.get(0);
    }
}
