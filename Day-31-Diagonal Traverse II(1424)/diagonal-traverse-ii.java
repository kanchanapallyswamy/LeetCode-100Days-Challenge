class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Map<Integer,List<Integer>> mp = new TreeMap<>();
        for(int i = 0 ; i  < nums.size() ; i++){
            for(int j = 0 ; j  <nums.get(i).size() ; j++){
                int idx = i + j;
                if(!mp.containsKey(idx)) mp.put(idx,new ArrayList<>());
                mp.get(idx).add(nums.get(i).get(j));
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(var i : mp.entrySet()){
            var res = i.getValue();
            Collections.reverse(res);
                ans.addAll(res);
        }
        System.out.println(ans);
        int a[] = new int[ans.size()];
        int k = 0;
        for(var i : ans)a[k++]=i;
        return a;
    }
}
