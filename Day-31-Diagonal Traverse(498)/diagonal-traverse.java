class Solution {
    public int[] findDiagonalOrder(int[][] a) {
        List<Integer> l = new ArrayList<>();
        int r = a.length , c = a[0].length , k = 0;
        List<Integer> temp = new ArrayList<>();
        for (int y = 0; y < r; y++) {
            int i = y;
            int j = 0;
            while (i >= 0 && j < c) {
                temp.add(a[i--][j++]);
            }
            if (k % 2 == 1)
                Collections.reverse(temp);
            l.addAll(temp);
            temp = new ArrayList<>();
            k++;
        }
        for (int x = 1; x < c; x++) {
           int i = r - 1;
            int j = x;
            while (i >= 0 && j < c) {
                temp.add(a[i--][j++]);
            }
            if (k % 2 == 1)
                Collections.reverse(temp);
            l.addAll(temp);
            temp = new ArrayList<>();
            k++;
        }
        int res[] = new int[l.size()];
        for (int i = 0; i < l.size(); i++)
            res[i] = l.get(i);
        return res;
    }

}
