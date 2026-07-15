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
    public ListNode middleNode(ListNode head) {
        // ListNode current = head;
        // int mid = 1;
        // int count=1;
        // while(current!=null) {
        //     current=current.next;
        //     count++;
        // }
        // current=head;
        // if(count%2==0) mid=count%2 +1;
        // else mid=count%2;
        // for(int i=1;i<mid;i++) {
        //     current=current.next;
        // }
        // return current;

        // use of fastt and sslow pointer when fast will reach teh end slow will be at the mid of the list 
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null) {
            slow =slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}