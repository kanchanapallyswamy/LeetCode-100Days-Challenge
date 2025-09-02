class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        return helper(lists,0,lists.length-1);
    }
    ListNode helper(ListNode[] lists, int start, int end) {
        if(start==end)return lists[start];
        int mid = (start+end)/2;
        ListNode l1 = helper(lists,start,mid);
        ListNode l2 = helper(lists,mid+1,end);
        return merge(l1,l2);
    }
    ListNode merge(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode merged = new ListNode(-9999);
        ListNode temp = merged;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                temp.next=new ListNode(l1.val);
                l1=l1.next;
            }
            else{
                temp.next = new ListNode(l2.val);
                l2=l2.next;
            }
            temp = temp.next;
        }
        while(l1!=null){
                temp.next=new ListNode(l1.val);
                l1=l1.next;
                temp = temp.next;
        }
        while(l2!=null){
                temp.next = new ListNode(l2.val);
                l2=l2.next;
                temp = temp.next;
        }
            return merged.next;
    }
}
