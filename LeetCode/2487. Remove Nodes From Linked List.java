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
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int n = list.size();
        int max = list.get(n - 1);
        for (int i = n - 1; i >= 0; i--) {
            if (list.get(i) < max) {
                list.remove(i);
            } else {
                max = list.get(i);
            }
        }
        head = new ListNode(list.get(0));
        temp = head;
        for (int i = 1; i < list.size(); i++) {
            temp.next = new ListNode(list.get(i));
            temp = temp.next;
        }
        return head;
    }
}
