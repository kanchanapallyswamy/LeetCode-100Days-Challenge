class Solution {
    public String convert(String s, int numRows) {
        String ans = "";
        String res[] = new String[numRows];
        for (var i = 0; i < res.length; i++)
            res[i] = "";
        int i = 0;
        while (i < s.length()) {
            for (int k = 0; k < numRows && i < s.length(); k++) {
                res[k] += s.charAt(i++);
            }
            for (int k = numRows - 2; k > 0 && i < s.length(); k--) {
                res[k] += s.charAt(i++);
            }
        }
        for (var p : res)
            ans += p;
        return ans;
    }
}
