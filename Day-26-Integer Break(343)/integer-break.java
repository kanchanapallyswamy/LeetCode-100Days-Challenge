class Solution {
    public int integerBreak(int n) {
      if(n==2) return 1;
      if(n==3)return 2;
      int x = n / 3;
      if(n%3==0)  return (int)Math.pow(3,x);
      else if(n%3==2) return (int)Math.pow(3,x) * 2;
      return (int)Math.pow(3,(n-4)/3)*4;   
    }
}
