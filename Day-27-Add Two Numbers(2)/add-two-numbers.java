class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     if(l1 == null)return l2;
     if(l2 == null)return l1;
     ListNode dummy = new ListNode(-1000);
     ListNode c = dummy;
     int carry = 0 , sum = 0;
     while(l1 != null && l2 != null){
        sum = l1.val + l2.val + carry ;
        c.next = new ListNode(sum % 10);
        carry = sum / 10;
        c = c.next;
        l1 = l1.next;
        l2 = l2.next;
     }
     while(l1 != null){
        sum = l1.val + carry;
        c.next = new ListNode(sum % 10);
        carry = sum / 10;
        c = c.next;
        l1 = l1.next;
     }
      while(l2 != null){
        sum = l2.val + carry;
        c.next = new ListNode(sum % 10);
        carry = sum / 10;
        c = c.next;
        l2 = l2.next;
     }
     if(carry != 0 )c.next =new  ListNode(carry);
     return dummy.next;

    }
}
