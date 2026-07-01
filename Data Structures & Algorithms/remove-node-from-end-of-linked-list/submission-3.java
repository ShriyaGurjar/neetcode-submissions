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
    public ListNode removeNthFromEnd(ListNode head, int n) {
          if(head== null || head.next==null){
            return null;
          }
          ListNode dummy=new ListNode(0);
          dummy.next=head;
          ListNode fast=dummy;
          ListNode slow=dummy;

          //move fast till n+1;

        for(int i=1;i<=n+1;i++){
            fast=fast.next;
        }

        //move both slow and fast

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
       if(slow!=null){
          slow.next=slow.next.next;
       }
       return dummy.next;
    }
}
