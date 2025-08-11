class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftmax = height[0], rightmax = height[n - 1];
        int i = 0, j = n - 1, res = 0;
        while (i <= j) {
            if (leftmax < rightmax) {
                leftmax = Math.max(height[i], leftmax);
                res += leftmax - height[i];
                i++;
            } else {
                rightmax = Math.max(height[j], rightmax);
                res += rightmax - height[j];
                j--;
            }
        }
        return res;
    }
}
