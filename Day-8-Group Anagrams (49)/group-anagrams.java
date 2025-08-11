class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();
        for (var str : strs) {
            String sorted = sort(str);
            if (!mp.containsKey(sorted))
                mp.put(sorted, new ArrayList<>());
            mp.get(sorted).add(str);
        }
        for (var i : mp.entrySet())
            ans.add(i.getValue());
        return ans;
    }

    String sort(String s) {
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
