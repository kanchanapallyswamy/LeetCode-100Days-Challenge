class Solution {
    public int countPrimes(int n) {
        if(n<=2)return 0;
        int c=0;
        boolean p[]=new boolean[n+1];;
        Arrays.fill(p,true);
     p[0]=false;
        p[1]=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(p[i]){
                for(int j=i*i;j<=n;j+=i){
                    p[j]=false;
                }
            }
        } 
        for(int i=2;i<n;i++){
            if(p[i])c++;
        }
        return c;
       
    }
}
