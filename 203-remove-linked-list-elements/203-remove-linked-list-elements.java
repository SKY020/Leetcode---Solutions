/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
         if(head==null)
            return head;
        
        ListNode curr=head;
        while(curr.next!=null)
        {
            if(curr.next.val==val)
            {
                curr.next=curr.next.next;
            }
            else
            curr=curr.next;
        }
        
        if(head.val==val) //if first node == val e.g [6,6,6,6,34,5,6,23,12] and val=6
            head=head.next;  //so to remove it we do this line here.
            
        return head;
    }
}