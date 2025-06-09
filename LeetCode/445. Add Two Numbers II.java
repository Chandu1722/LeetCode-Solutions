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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        ListNode t1 = l1;
        while (t1 != null) {
            list1.add(t1.val);
            t1 = t1.next;
        }
        ListNode t2 = l2;
        while (t2 != null) {
            list2.add(t2.val);
            t2 = t2.next;
        }
        int n1 = list1.size() - 1;
        int n2 = list2.size() - 1;
        int carry = 0;
        ListNode head = null;
        while (n1 >= 0 || n2 >= 0 || carry != 0) {
            int sum = 0;
            if (n1 >= 0) {
                sum += list1.get(n1);
            }
            if (n2 >= 0) {
                sum += list2.get(n2);
            }
            sum += carry;
            carry = sum / 10;
            head = add(sum % 10, head);
            n1--;
            n2--;
        }
        return head;
    }

    public static ListNode add(int val, ListNode h) {
        ListNode newNode = new ListNode(val);
        if (h == null) {
            h = newNode;
            return h;
        }
        newNode.next = h;
        h = newNode;
        return h;
    }
}
