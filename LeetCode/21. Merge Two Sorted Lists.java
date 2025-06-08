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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // ListNode temp1=l1;
        ListNode temp2 = l2;
        while (temp2 != null) {
            l1 = addNode(l1, temp2.val);
            temp2 = temp2.next;
        }
        return l1;
    }

    public ListNode addNode(ListNode head, int val) {
        // ListNode temp=head;
        // ListNode prev=null;
        // while(temp.next!=null){
        //     if(val<=temp.val){
        //         prev.next=ListNode(int val);
        //         prev.next.next=temp;

        //     }
        //     prev=temp;
        //     temp=temp.next;
        // }
        // return head;
        ListNode newNode = new ListNode(val);
        if (head == null || val < head.val) {
            newNode.next = head;
            head = newNode;
            return newNode;
        }
        ListNode temp = head;
        while (temp.next != null && temp.next.val < val) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
}
