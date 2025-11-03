class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int k, int[][] q) {
        boolean a[] = new boolean[q.length];
        for(int i = 0; i<q.length; i++){
            if( valid(q[i],nums,k))a[i] = true;
            else a[i] = false;
        }
        return a;
    }
    boolean valid(int a[], int nums[], int k){
        int st = Math.min(a[0], a[1]), end = Math.max(a[1], a[0]);
        if(st == end)return true;
        while( st + 1 <= end){
            if(nums[st + 1] - nums[st] > k)return false;
            st++;
        }
        return true;
    }
}
