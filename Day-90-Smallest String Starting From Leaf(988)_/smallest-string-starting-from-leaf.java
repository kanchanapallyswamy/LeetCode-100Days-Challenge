class Solution {
    public String smallestFromLeaf(TreeNode root) {
        if (root == null)
            return "";
        List<Character> path = new ArrayList<>();
        List<String> l = new ArrayList<>();
        List<List<Character>> allpaths = new ArrayList<>();
        allpaths = paths(root, path, allpaths);
        String s = "";
        List<Integer> ans = new ArrayList<>();
        String res = find(allpaths.get(0));
        for (var i : allpaths) {
            if (find(i).compareTo(res) < 0)
                res = find(i);
        }
        return res;
    }
    List<List<Character>> paths(TreeNode r, List<Character> path, List<List<Character>> allpaths) {
        if (r == null)
            return allpaths;
        path.add((char) (r.val + 'a'));
        helper(r, path, allpaths);
        return allpaths;
    }
    void helper(TreeNode r, List<Character> path, List<List<Character>> allpaths) {
        if (r.left == null && r.right == null) {

            allpaths.add(new ArrayList<>(path));
        }

        if (r.left != null) {
            path.add((char) (r.left.val + 'a'));
            helper(r.left, path, allpaths);
            path.remove(path.size() - 1);
        }

        if (r.right != null) {
            path.add((char) (r.right.val + 'a'));
            helper(r.right, path, allpaths);
            path.remove(path.size() - 1);
        }
    }

    String find(List<Character> l) {
        StringBuilder s = new StringBuilder();
        for (var i : l)
            s.append(i);
        return s.reverse().toString();
    }
}
