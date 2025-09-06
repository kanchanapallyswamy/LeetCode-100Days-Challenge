class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)return null;
        // Insert
        Node c=head;
        while(c!=null){
            Node nn=new Node(c.val);
            nn.next=c.next;
            c.next=nn;
            c=c.next.next;
        }
        c=head;
    // Copy pointers
        while(c!=null){
            if(c.random!=null){
                c.next.random=c.random.next;
            }
            // else c.next.random=null;
            c=c.next.next;
        }
    // Divide
    c=head;
    Node dummy=new Node(-999);
    Node res=dummy;
    while(c!=null){
        res.next=c.next;
        c.next=c.next.next;
       c=c.next;
       res=res.next;
    }
    return dummy.next;
    }
}
