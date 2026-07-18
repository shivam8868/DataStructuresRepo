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
    public int pairSum(ListNode head) {
        // lets try sotring the values in the a list then with a loop or two pointer approach find the max twin sum 
        List<Integer> list = new ArrayList<>();
        ListNode current=head;
        while(current!=null) {
            list.add(current.val);
            current=current.next;
        }
        int sum=0;
        int i=0;
        int j=list.size()-1;
        while(i<j) {
            sum=Math.max(sum,(list.get(i)+list.get(j)));
            i++;
            j--;
        }
        return sum;
    }
}