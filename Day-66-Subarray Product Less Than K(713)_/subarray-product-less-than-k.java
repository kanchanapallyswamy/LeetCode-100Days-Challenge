class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if( k <= 1)return 0;
        int s = 0 , e = 0 , p = 1 , cnt = 0;
        while(e < nums.length){
            p = p * nums[e];
            while(p >= k){
                p = p / nums[s];
                s++;
            }
            cnt += (e - s + 1);
            e++;
        }
        return cnt;
    }
}
