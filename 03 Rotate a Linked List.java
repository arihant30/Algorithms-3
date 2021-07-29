class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        Node start=head;
        while(head.next!=null)
            head=head.next;
        
        head.next=start;
        Node curr1=start;
        for(int i=0;i<k-1;i++){
            curr1=curr1.next;
        }
        start=curr1.next;
        curr1.next=null;
        return start;
    }
}
