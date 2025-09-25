class Solution {
    public Node flatten(Node head) {
        Node temp = head;
        while(temp!=null){
            if(temp.child!=null){
            Node    next = temp.next;
            Node   child = temp.child;
                temp.next = child;
                child.prev = temp;
                temp.child = null;
                while(child.next!=null)child = child.next;
                if(next!=null){
                    child.next=next;
                    next.prev = child;
                    }
            }
                temp = temp.next;          
        }
        return head;
    }
}


