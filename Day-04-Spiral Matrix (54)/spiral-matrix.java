class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> x = new ArrayList<>();
        int r = m.length, c = m[0].length, count = 0;
        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        while (count < r * c) {
            for (int i = left; i <= right; i++) {
                x.add(m[top][i]);
                count++;
            }
            top++;
            if (count == r * c)
                break;
            for (int i = top; i <= bottom; i++) {
                x.add(m[i][right]);
                count++;
            }
            right--;
            if (count == r * c)
                break;
            for (int i = right; i >= left; i--) {
                x.add(m[bottom][i]);
                count++;
            }
            bottom--;
            if (count == r * c)
                break;
            for (int i = bottom; i >= top; i--) {
                x.add(m[i][left]);
                count++;
            }
            left++;
        }
        return x;
    }
}
