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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return head;
        int l = 1;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            l++;
        }
        int pos = k % l;
        if (pos == 0)
            return head;
        ListNode curr = head;
        for (int i = 0; i < l - pos - 1; i++) {
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        temp.next = head;
        return newHead;
    }
}
