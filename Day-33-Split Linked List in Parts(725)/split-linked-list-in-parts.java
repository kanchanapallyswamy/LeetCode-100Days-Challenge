class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode res[] = new ListNode[k];
        if(head == null) return res;
        int size = size(head);
              int cf = size % k;
              for(int i = 0; i < cf; i++){
                int x = size / k + 1;
                res[i] = func(head,x);
               while(x --> 0)
                    head = head.next;
              }  
              for(int i = cf; i < k; i++){
                int x = size / k;
                res[i]= func(head,x);
                while(x --> 0)
                    head = head.next;
              }
            return res;
    }
    ListNode func(ListNode head ,int cnt){
        ListNode dummy = new ListNode(-999);
        ListNode c = dummy;
        while(cnt --> 0){
            c.next = new ListNode(head.val);
            head = head.next;
            c = c.next;
        }
        return dummy.next;
    }
    int size(ListNode head){
        int cnt = 0;
        while(head != null){
            cnt++;
            head = head.next;
        }
        return cnt;
    }
    
}
