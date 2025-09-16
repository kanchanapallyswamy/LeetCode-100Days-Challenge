class Solution {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        if (root == null)
            return -1;
        helper(root, 0);
        return sum;
    }
    void helper(TreeNode r, int ss) {
        if (r == null)
            return;
        ss = ss * 10 + r.val;
        if (r.left == null && r.right == null) 
            sum += ss;
        helper(r.left, ss);
        helper(r.right, ss);
    }
}
