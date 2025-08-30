class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer>lst=new ArrayList<>();
        for(int i=1;i<=n;i++){
            lst.add(i);
        }
        Collections.sort(lst,(x,y)->{
            return (x+"").compareTo(y+"");
        });
        return lst;
        
    }
}
