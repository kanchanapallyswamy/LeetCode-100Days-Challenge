class Solution {
        TreeMap<Double,Integer> right=new TreeMap<>();
        TreeMap<Double,Integer> left=new TreeMap<>();
        int rightsize = 0 , leftsize = 0;
    public double[] medianSlidingWindow(int[] nums, int k) {
        double ans[]=new double[nums.length-k+1];
        int p=0;
        for(int i = 0; i < k; i++){
            add((double)nums[i]);
        }
            ans[p++]=find();
        for(int i=1;i<nums.length - k + 1;i++){
            add((double)nums[i+k-1]);
            remove((double)nums[i-1]);
            ans[p++]=find();
        }
        return ans;
    }
    void balance(){
          int diff = leftsize - rightsize;
            if(diff == -1 ){
                double val = right.firstKey();
                right.put(val,right.get(val)-1);
                if(right.get(val)==0)right.remove(val);
                left.put(val,1+left.getOrDefault(val,0));
                rightsize--;
                leftsize++;
            }
            else if(diff == 2){
                double val = left.lastKey();
                left.put(val,left.get(val)-1);
                if(left.get(val)==0)left.remove(val);
                right.put(val,1+right.getOrDefault(val,0));
                rightsize++;
                leftsize--;
            }
    }
    void add(double add){
         if(leftsize == 0 || add<=left.lastKey()){
            left.put(add,1+left.getOrDefault(add,0));
            leftsize++;
         }
        else{
            right.put(add,1+right.getOrDefault(add,0));
            rightsize++;
        }
         balance();
    }
    double find(){
        if(leftsize > rightsize )  return left.lastKey();
        else return (right.firstKey()+left.lastKey())/2.0;
    }
    void remove(double rem){
        if( left.containsKey(rem)){
            left.put(rem,left.get(rem)-1);
            if(left.get(rem) == 0)left.remove(rem);
            leftsize--;
        }
        else {
             right.put(rem,right.get(rem)-1);
            if(right.get(rem) == 0)right.remove(rem);
            rightsize--;
        }
         balance();
    }
}
