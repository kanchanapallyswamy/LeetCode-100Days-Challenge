class Solution {
    public int maxArea(int[] height) {
        int low = 0, high = height.length - 1, max = 0;
        while (low < high) {
            int width = high - low;
            int min = Math.min(height[low], height[high]);
            int area = width * min;
            max = Math.max(max, area);
            if (height[low] < height[high])
                low++;
            else
                high--;
        }
        return max;
    }
}
