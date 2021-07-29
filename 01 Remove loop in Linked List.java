class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        if(head==null || head.next==null){
            return;
        }
        Node slow=head;
        Node fast=head;
        slow=slow.next;
        fast=fast.next.next;
        while(fast!=null && fast.next!=null){
            if(slow==fast)
                break;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow==fast){
            slow=head;
            if(slow==fast){  //if at first position
                while(fast.next!=slow){
                    fast=fast.next;
                }
                fast.next=null;
            }
            else if(slow!=fast){
                while(slow.next!=fast.next){
                    slow=slow.next;
                    fast=fast.next;
                }
                fast.next=null;
            }
        }
    }
}
