class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        int n=a.length;
        int []ans=new int[n-k+1];
        Map<Integer,Integer> mp=new HashMap<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<k;i++){
            pq.add(a[i]);
            mp.put(a[i],1+mp.getOrDefault(a[i],0));
        }
        ans[0]=pq.peek();
        for(int i=1;i<n-k+1;i++){
            int add=a[i+k-1];
            int del=a[i-1];
            mp.put(del,mp.get(del)-1);
            if(mp.get(del)==0)mp.remove(del);
             while(pq.size()>0 && !mp.containsKey(pq.peek())){
                pq.remove();
            }
            mp.put(add,1+mp.getOrDefault(add,0));
            pq.add(add);
            ans[i]=pq.peek();         
        }
        return ans;
    }
}
