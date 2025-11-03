class Solution {
    public int amountOfTime(TreeNode root, int start) {
        if (root == null)
            return 0;
        int c = 0;
        Map<TreeNode, TreeNode> mp = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode strt = null;
        q.add(root);
        while (q.size() > 0) {
            TreeNode k = q.remove();
            if (k.val == start)
                strt = k;
            if (k.left != null) {
                q.add(k.left);
                mp.put(k.left, k);
            }
            if (k.right != null) {
                q.add(k.right);
                mp.put(k.right, k);
            }
        }
        q.add(strt);
        Set<TreeNode> st = new HashSet<>();
        while (q.size() > 0) {
            int n = q.size();
            c++;
            while (n-- > 0) {
                TreeNode k = q.remove();
                st.add(k);
                if (k.left != null && !st.contains(k.left))
                    q.add(k.left);
                if (k.right != null && !st.contains(k.right))
                    q.add(k.right);
                if (mp.get(k) != null && !st.contains(mp.get(k)))
                    q.add(mp.get(k));
            }
        }
        return c - 1;
    }
}
