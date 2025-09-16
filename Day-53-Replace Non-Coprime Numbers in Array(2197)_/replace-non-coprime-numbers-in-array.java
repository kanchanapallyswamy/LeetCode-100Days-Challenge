class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for (var i : nums) {
            while (!l.isEmpty() && gcd(l.get(l.size() - 1), i) > 1) {
                int rem = l.remove(l.size() - 1);
                i = (int) ((long) rem * i / gcd(rem, i));
            }
            l.add(i);
        }
        return l;
    }

    int gcd(int a, int b) {
       return b == 0 ? a : gcd(b,a % b);
    }
}
