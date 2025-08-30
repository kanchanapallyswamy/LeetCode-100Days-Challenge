class Solution {
    public char processStr(String s, long k) {
        StringBuilder res = new StringBuilder();
        for (char i : s.toCharArray()) {
            if (i == '#') {
                res.append(res.toString());
            } else if (i == '%') {
                res.reverse();
            } else if (i == '*') {
                if (res.length() >= 1) 
                    res.deleteCharAt(res.length() - 1);
            } else {
                res.append(i);
            }
        }
        
        return k < res.length() ? res.charAt((int) k) : '.';
    }
}
