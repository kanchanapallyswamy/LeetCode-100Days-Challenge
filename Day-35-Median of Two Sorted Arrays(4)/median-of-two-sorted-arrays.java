class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         PriorityQueue<Double> min = new PriorityQueue<>();
         PriorityQueue<Double> max = new PriorityQueue<>(Collections.reverseOrder());
         List<Integer> l = new ArrayList<>();
         for(var i : nums1)l.add(i);
         for(var i : nums2)l.add(i);
         for(var p : l){
            double i = (double)p;
            if(max.size()==0 || i <= max.peek()) max.add(i);
            else min.add(i);
            int diff = max.size() - min.size();
            if(diff == 2)
                min.add(max.remove());
            else if(diff == -1)
                max.add(min.remove());
         }
         if(max.size() == min.size())
                return (max.peek()+min.peek())/2.0;
        return max.peek();
    }
}
