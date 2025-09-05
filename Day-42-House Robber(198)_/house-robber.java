class Solution {
    public int rob(int[] nums) {
        int maxsum = 0 , prevsum = 0;
        for(var curr : nums){
            int max = Math.max(maxsum , curr + prevsum);
            prevsum = maxsum;
            maxsum = max;
        }
        return maxsum;
    }
}
