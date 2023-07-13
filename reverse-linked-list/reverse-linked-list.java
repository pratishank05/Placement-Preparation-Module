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
    public ListNode reverseList(ListNode head) {
        
       if(head==null ||head.next==null)
       {
           return head;
       }
       else{
           ListNode nextNode=null;
        ListNode current=head;
        ListNode prev=null;
        while(current!=null)
        {
           nextNode=current.next;
           current.next=prev;
           //update
           prev=current;
           current=nextNode;
        }
        head=prev;
        return head;
       }

    }
}