class Solution {
    public int sumNumbers(TreeNode root) {
        List<Integer> path=new ArrayList<>();
       if(root==null)return -1;
       List<List<Integer>> allpaths=new ArrayList<>();
       allpaths=paths(root,path,allpaths);
      int s=0;
       for(var i:allpaths)
        s+=find(i);
       return s;
        
    }

List<List<Integer>> paths(TreeNode r,List<Integer> path, List<List<Integer>> allpaths){
    if(r==null)return allpaths;
     path.add(r.val);
       helper(r,path,allpaths);
       return allpaths;
}
void helper(TreeNode r,List<Integer> path, List<List<Integer>> allpaths){
        if(r.left==null && r.right==null)
            allpaths.add(new ArrayList<>(path));
        if(r.left!=null){
            path.add(r.left.val);
            helper(r.left,path,allpaths);
            path.remove(path.size()-1);
        }
        if(r.right!=null){
            path.add(r.right.val);
            helper(r.right,path,allpaths);
            path.remove(path.size()-1);
        }
    }
    int find(List<Integer> l){
        int c=l.size();
        c--;
        int s=0;
        for(int i=0;i<l.size();i++){
            s+=l.get(i)*Math.pow(10,c--);
        }
        return s;
    }
}
