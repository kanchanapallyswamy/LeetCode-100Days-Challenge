class Solution {
    public ListNode mergeInBetween(ListNode l1, int a, int b, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode c = l1, c1 = l1;
        while (b-- > 0)  c1 = c1.next;
        ListNode k = c1.next;
        c1.next = null;
        while (a-- > 1) c = c.next;
        c.next = null;
        int p = size(l1);
        int p1 = size(l2);
        c = l1;
        while (p-- > 1)c = c.next;
        c.next = l2;
        int p3 = size(l1);
        c = l1;
        while (p3-- > 1)c = c.next;
        c.next = k;
        return l1;
    }
    int size(ListNode h) {
        int s = 0;
        while (h != null) {
            s++;
            h = h.next;
        }
        return s;
    }
}
