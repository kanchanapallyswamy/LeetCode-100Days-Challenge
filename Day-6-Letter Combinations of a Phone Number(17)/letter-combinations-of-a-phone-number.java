class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.equals(""))
            return ans;
        Map<Character, List<Character>> mp = new HashMap<>();
        for (char ch = '2'; ch <= '9'; ch++)
            mp.put(ch, new ArrayList<>());
        for (char ch = 'a'; ch <= 'c'; ch++)
            mp.get('2').add(ch);
        for (char ch = 'd'; ch <= 'f'; ch++)
            mp.get('3').add(ch);
        for (char ch = 'g'; ch <= 'i'; ch++)
            mp.get('4').add(ch);
        for (char ch = 'j'; ch <= 'l'; ch++)
            mp.get('5').add(ch);
        for (char ch = 'm'; ch <= 'o'; ch++)
            mp.get('6').add(ch);
        for (char ch = 'p'; ch <= 's'; ch++)
            mp.get('7').add(ch);
        for (char ch = 't'; ch <= 'v'; ch++)
            mp.get('8').add(ch);
        for (char ch = 'w'; ch <= 'z'; ch++)
            mp.get('9').add(ch);
        Queue<String> q = new LinkedList<>();
        for (var i : mp.get(digits.charAt(0)))
            q.add(i + "");
        for (int i = 1; i < digits.length(); i++) {
            int n = q.size();
            while (n-- > 0) {
                String k = q.remove();
                for (var j : mp.get(digits.charAt(i)))
                    q.add(k + "" + j);
            }
        }
        while (q.size() > 0)
            ans.add(q.remove());
        return ans;
    }
}
