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
    public ListNode removeNodes(ListNode head) {
        //     if(head == null) return null;
        //     if(head!=null && head.next==null) return head;
        //     ListNode current=head;
        //     ListNode prev=null;
        //     while(current!=null) {
        //         ListNode next=current.next;
        //         current.next=prev;
        //         prev=current;
        //         current=next;
        //     } 

        //     current=prev;
        //     while(current!=null) {
        //         ListNode next=current.next;
        //         if(current.next != null && current.next.val<current.val) {
        //             current.next=current.next.next;
        //         }
        //         else {
        //             current=current.next;
        //         }
        //         // if(current.)
        //     }
        //     current=prev;
        //     ListNode prev2=null;
        // while(current!=null) {
        //     ListNode next2=current.next;
        //     current.next=prev2;
        //     prev2=current;
        //     current=next2;
        // }

        // head=prev2;
        // return head;

        // Step 1: Reverse the list
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 2: Remove nodes smaller than max so far
        ListNode dummy = new ListNode(0);
        dummy.next = prev;
        curr = prev;
        int maxSoFar = curr.val;

        while (curr != null && curr.next != null) {
            if (curr.next.val < maxSoFar) {
                curr.next = curr.next.next; // remove smaller node
            } else {
                curr = curr.next;
                maxSoFar = curr.val; // update max
            }
        }

        // Step 3: Reverse again to restore original order
        prev = null;
        curr = dummy.next;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }
}