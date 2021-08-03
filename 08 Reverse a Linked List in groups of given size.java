class Solution
{
    public static Node reverse(Node node, int k)
    {
        Node pr3v=null;
        Node n3xt=null;
        Node curr=node;
        int count=0;
        while(count<k && curr!=null){
            n3xt=curr.next;
            curr.next=pr3v;
            pr3v=curr;
            curr=n3xt;
            count++;            
        }
        if(n3xt!=null){
            node.next=reverse(n3xt,k);
        }
        return pr3v;
    }
}
