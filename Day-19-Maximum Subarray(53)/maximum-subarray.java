class Solution {
    public int maxSubArray(int[] nums) {

        int s = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (s < 0)
                s = 0;
            s += nums[i];
            max = Math.max(s, max);

        }
        if (nums.length == 1)
            return nums[0];
        return max;

    }
}
