class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length, zc = 0, oc = 0, tc = 0;
        for (var i : nums)
            if (i == 0)
                zc++;
            else if (i == 1)
                oc++;
            else
                tc++;
        for (int i = 0; i < n; i++) {
            if (zc != 0) {
                nums[i] = 0;
                zc--;
            } else if (oc != 0) {
                nums[i] = 1;
                oc--;
            } else if (tc != 0) {
                nums[i] = 2;
                tc--;
            }
        }
    }
}
