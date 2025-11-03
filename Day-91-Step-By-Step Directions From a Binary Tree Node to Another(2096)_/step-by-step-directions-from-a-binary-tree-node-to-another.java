class Solution {
    public String getDirections(TreeNode root, int start, int dest) {
        int c = 0;
        String k = "";
        List<String> l = help(root, start);
        List<String> r = help(root, dest);
        for (int i = 0; i < Math.min(l.size(), r.size()); i++) {
            if (l.get(i) == r.get(i))
                c++;
            else
                break;
        }
        int p = l.size() - c;
        for (int i = 0; i < p; i++)
            k += "U";
        for (int i = c; i < r.size(); i++)
            k += r.get(i);
        return k;
    }

    List<String> help(TreeNode root, int x) {
        List<String> l = new ArrayList<>();
        if (root == null)
            return l;
        boolean found = helper(root, x, l);
        if (found)
            return l;
        else
            return new ArrayList<>();
    }

    boolean helper(TreeNode root, int x, List<String> l) {
        if (root.val == x)
            return true;
        if (root.left != null) {
            l.add("L");
            boolean found = helper(root.left, x, l);
            if (found)
                return true;
            l.remove(l.size() - 1);
        }

        if (root.right != null) {
            l.add("R");
            boolean found = helper(root.right, x, l);
            if (found)
                return true;
            l.remove(l.size() - 1);
        }
        return false;
    }
}
