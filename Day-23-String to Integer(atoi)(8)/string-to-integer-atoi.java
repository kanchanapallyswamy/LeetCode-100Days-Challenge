class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if(s.length()==0){
            return 0;
        }
        long ans=0;
        int i = 0 , sign = 1; 
        if(i<s.length() && s.charAt(0)=='-' || s.charAt(0)=='+'){
            if(s.charAt(0)=='-') sign = -1;
             i++;
        }
        while( i<s.length() && s.charAt(i)=='0'){
            i++;            
        }
        for(int z=i; z<s.length(); z++){
            char ch=s.charAt(z);
            if(!Character.isDigit(ch)) break;
           ans = ans *10 + (ch - '0');
           if(ans>Integer.MAX_VALUE){
                return sign == -1 ? Integer.MIN_VALUE:Integer.MAX_VALUE;
           }      
        }
        return (int)ans * sign ; 
    }
}
