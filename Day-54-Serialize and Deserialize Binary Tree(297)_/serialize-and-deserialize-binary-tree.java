
public class Codec {
    public String serialize(TreeNode root) {
        StringBuilder s = new StringBuilder();
        if(root == null)return "null";
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        s.append(root.val+",");
        while(q.size() > 0){
            TreeNode rem = q.remove();
            if(rem.left!=null){
                q.add(rem.left);
                s.append(rem.left.val+",");
            }
            else {
                s.append("null,");
            }
            if(rem.right!=null){
                q.add(rem.right);
                s.append(rem.right.val+",");
            }
            else {
                s.append("null,");
            }
        }
        return s.toString();
    }
    public TreeNode deserialize(String data) {
        if(data.equals("null"))return null;
        String a[] = data.split(",");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(a[0]));
        int i = 1;
        q.add(root);
        while(q.size()>0){
            TreeNode curr = q.remove();
            if(i < a.length && !a[i].equals("null")){
                curr.left = new TreeNode(Integer.parseInt(a[i]));
                q.add(curr.left);
            }
            i++;
            if(i < a.length && !a[i].equals("null")){
                curr.right = new TreeNode(Integer.parseInt(a[i]));
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
