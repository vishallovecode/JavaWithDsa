/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode Cycle(ListNode head)
    {
        if(head==null || head.next==null)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next !=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
                return fast;
        }
        return null;
    }
    public ListNode detectCycle(ListNode head) {
         ListNode slow=head;
        
        ListNode fast=Cycle(head);
        if(fast==null)
            return null;
        
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
            
        }
      // slow = slow.next; // this will break the loop
        return slow; // node  from where loop started
    }
}
