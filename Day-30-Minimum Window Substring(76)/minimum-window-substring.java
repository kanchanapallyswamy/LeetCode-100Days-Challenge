class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length())
            return "";
        int ws = 0, we = 0, mn = s.length() + 1, si = -1, ei = -1;
        Map<Character, Integer> mp = new HashMap<>();
        for (var i : t.toCharArray())
            mp.put(i, 1 + mp.getOrDefault(i, 0));
        int sn = mp.size();
        for (we = 0; we < s.length(); we++) {
            char ch = s.charAt(we);
            if (mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) - 1);
                if (mp.get(ch) == 0) {
                    sn--;
                }
            }
            while (sn == 0) {
                if (we - ws + 1 < mn) {
                    mn = we - ws + 1;
                    si = ws;
                    ei = we;
                }
                char chh = s.charAt(ws);
                if (mp.containsKey(chh)) {
                    mp.put(chh, mp.get(chh) + 1);
                    if (mp.get(chh) == 1)
                        sn++;
                }
                ws++;
            }
        }
        if (si == -1)
            return "";
        return s.substring(si, ei + 1);
    }
}
