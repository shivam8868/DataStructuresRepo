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
    public boolean isPalindrome(ListNode head) {
        // lets try sotring the data into a list and then check palindrome by two pointer appraoch?


        if(head==null) return false;
        if(head!=null && head.next==null) return true;
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while(current!=null) {
            list.add(current.val);
            current=current.next;
        }
        // now aply two pointer approach 


        int low=0;
        int high = list.size()-1;
        while(low<high) {
            if(!list.get(low).equals(list.get(high)))
             return false;
            low++;
            high--;
        }
        return true;
    }
}