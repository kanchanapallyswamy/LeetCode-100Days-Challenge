class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;
        boolean ai[] = new boolean[n];
        boolean ad[] = new boolean[n];
        ai[0] = true;
        for(int i = 1 ; i <= n - 1; i++)
               ai[i] = (ai[i-1] && nums[i]>nums[i-1]);
        ad[n-1] = true;
        for(int i = n - 2 ; i >= 0; i--)
                ad[i] = (ad[i+1] && nums[i]>nums[i+1]);
        long p[] = new long[n];
        p[0] = nums[0];
        for(int i = 1 ; i < n; i++)
                p[i] = p[i-1] + nums[i];
        long s[] = new long[n];
        s[n-1]=nums[n-1];
        for(int i = n-2; i >=0 ;i--)
                s[i] = s[i+1] + nums[i];
        long min = Long.MAX_VALUE;
        for(int i = 0; i < n-1;i++)
                if(ai[i] && ad[i+1])
                    min = Math.min(min,Math.abs(p[i]-s[i+1]));
        return min == Long.MAX_VALUE ? -1 : min;
    }
}
