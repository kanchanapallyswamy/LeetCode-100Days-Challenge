class Solution {
    public boolean reorderedPowerOf2(int n) {
        String trgt = sort(n);
        for (int i = 0; i < 31; i++) {
            if (trgt.equals(sort((int) Math.pow(2, i))))
                return true;
        }
        return false;
    }

    String sort(int n) {
        char ch[] = (n + "").toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
