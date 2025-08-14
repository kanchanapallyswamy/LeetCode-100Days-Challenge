class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int max = 0;
        int s = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0 ; i < n; i++){
            mp.put(fruits[i],1+mp.getOrDefault(fruits[i],0));
            if(mp.size() >2){
                while(s<=i){
                        mp.put(fruits[s] , mp.get(fruits[s])-1);
                        if(mp.get(fruits[s]) == 0){
                            mp.remove(fruits[s]);
                            s++;
                            break;
                        }
                    
                    s++;
                }
            }
                max = Math.max(max , i - s + 1);
        }
        return max;

    }
}
