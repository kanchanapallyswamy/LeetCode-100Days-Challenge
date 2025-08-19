class Solution {
    public int clumsy(int n) {
        if (n == 1) return 1;
        List<String> l = new ArrayList<>();
        l.add(n + "");
        int cnt = 0;
        for (int i = n - 1; i >= 1; i--) {
            if (cnt == 0) {
                l.add("*");
                l.add(i + "");
                cnt++;
            } else if (cnt == 1) {
                l.add("/");
                l.add(i + "");
                cnt++;
            } else if (cnt == 2) {
                l.add("+");
                l.add(i + "");
                cnt++;
            } else if (cnt == 3) {
                l.add("-");
                l.add(i + "");
                cnt = 0;
            }
        }
        check_for_mult_div(l);
        check_for_add_sub(l);
        return Integer.parseInt(l.get(0));
    }

    void check_for_mult_div(List<String> l) {
        for (int i = 0; i < l.size() - 2; ) {
            String op = l.get(i + 1);
            if (op.equals("*") || op.equals("/")) {
                int x = Integer.parseInt(l.get(i));
                int y = Integer.parseInt(l.get(i + 2));
                int res = op.equals("*") ? x * y : x / y;
                l.set(i, String.valueOf(res));
                l.remove(i + 1);
                l.remove(i + 1);
            } else {
                i++;
            }
        }
    }

    void check_for_add_sub(List<String> l) {
        for (int i = 0; i < l.size() - 2; ) {
            String op = l.get(i + 1);
            int x = Integer.parseInt(l.get(i));
            int y = Integer.parseInt(l.get(i + 2));
            int res = op.equals("+") ? x + y : x - y;
            l.set(i, String.valueOf(res));
            l.remove(i + 1);
            l.remove(i + 1);
        }
    }
}
