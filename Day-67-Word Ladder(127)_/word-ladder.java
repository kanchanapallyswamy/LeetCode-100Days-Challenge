class Solution {
    public int ladderLength(String s, String e, List<String> l) {
        Set<String> st = new HashSet<>();
          Set<String> visit = new HashSet<>();
        Queue<Pair> q = new LinkedList<>();
        for(var i  : l)st.add(i);
        if(!st.contains(e))return 0;
        q.add(new Pair(s,1));
        visit.add(s);
        while(q.size()>0){
            var rem = q.remove();
            String ss = rem.s;
            int d =rem.x;
            if(ss.equals(e))return d;
            char a[] = ss.toCharArray();
            for(int i = 0 ; i < a.length; i++){
                char original = a[i];
                for(char ch = 'a'; ch <= 'z';ch++){
                    if(a[i]==ch)continue;
                a[i]=ch;
                String ans = new String(a);
                if(ans.equals(e))return d+1;
                if(st.contains(ans) && !visit.contains(ans)){
                    q.add(new Pair(ans,d+1));
                    visit.add(ans);
                }
            }
            a[i]=original;
            }
            }
            return 0;
    }
    
}
class Pair{
    String s;
    int x;
    Pair(String s, int x){
        this.s=s;
        this.x=x;
    }
}
