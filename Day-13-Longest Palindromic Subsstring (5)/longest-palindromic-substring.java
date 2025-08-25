class Solution {
    public String longestPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1)return s;
        int n = s.length();
        String ans = "";
        for(int i = 0 ; i < n; i++){
            String s1 = valid(s,i,i);
            String s2 = valid(s,i,i+1);
            if(s1.length() > ans.length()) ans = s1;
            if(s2.length() > ans.length()) ans = s2;
        }
        return ans;
    }
    String valid(String s , int i ,int j){
        while(i>=0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}
